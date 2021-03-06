import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Garden{
    private boolean playing;
    List<Plant> plants = new ArrayList<>();
    List<Insect> insects = new ArrayList<>();
    public Garden(){
        playing = true;
    }
    public boolean isPlaying() {
        return playing;
    }
    public void displayGarden() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("＊*•̩̩͙✩•̩̩͙*˚　G A R D E N  ˚*•̩̩͙✩•̩̩͙*˚＊");
        if(!plants.isEmpty()){
            for (Plant p: plants){
                System.out.println(p.toString());
            }
        }
        if(!insects.isEmpty()){
            for (Insect i: insects){
                System.out.println(i.toString());
            }
        }
        System.out.println("╚════════════════════════════╝");
    }

    public void mainMenu(){
        displayGarden();
        System.out.println("\nWhat would you like to do?");
        System.out.println("""
                1. Add Insect
                2. Add Flower
                3. Change Color of a Flower
                4. Feed the Insects
                5. Ask the Gardener to Take Care of the Hedges
                6. Exit""");
        int userChoice;
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                //create butterfly with abstract factory
                System.out.println("What kind of insect do you want to add to the garden?");
                System.out.println("\n1. Butterfly\n2. Bumblebee");
                AbstractGardenFactory gardenFactory1 = FactoryProducer.getFactory(true);
                int insectChoice = scanner.nextInt();
                switch (insectChoice){
                    case 1 -> {
                        Insect insect1 = gardenFactory1.getInsect("Butterfly");
                        insect1.produceInsect();
                        insects.add(insect1);
                    }
                    case 2 ->{
                        Insect insect2 = gardenFactory1.getInsect("Bumblebee");
                        insect2.produceInsect();
                        insects.add(insect2);
                    }
                }
                break;
            case 2:
                //create flower with abstract factory
                System.out.println("What kind of flower do you want to add to the garden?");
                System.out.println("\n1. Rose\n2. Tulip");
                AbstractGardenFactory gardenFactory2 = FactoryProducer.getFactory(false);
                int flowerChoice = scanner.nextInt();
                switch (flowerChoice) {
                    case 1 -> {
                        Plant plant1 = gardenFactory2.getPlant("Rose");
                        plant1.producePlant();
                        plants.add(plant1);
                    }
                    case 2 -> {
                        Plant plant2 = gardenFactory2.getPlant("Tulip");
                        plant2.producePlant();
                        plants.add(plant2);
                    }
                }
                break;
            case 3:
                //change the color of a flower
                if(plants!=null){
                    for (Plant p: plants){
                        System.out.println(p.toString());
                    }
                }
                System.out.println("Which flower's color do you want to change?");
                int colorChangeChoice = scanner.nextInt();
                if(Objects.equals(plants.get(colorChangeChoice - 1).getFlowerType(), "Tulip")){
                    Plant newPlant = new RedTulipDecorator(new Tulip());
                    plants.set(colorChangeChoice - 1,newPlant);
                    newPlant.notifyObserver();
                }
                else if (Objects.equals(plants.get(colorChangeChoice - 1).getFlowerType(), "Rose")){
                    Plant newPlant = new PinkRoseDecorator(new Rose());
                    plants.set(colorChangeChoice - 1,newPlant);
                    newPlant.notifyObserver();
                }
                break;
            case 4:
                //feeding the insects
                if(!insects.isEmpty()){
                    HungerState hungerState = new HungerState();
                    hungerState.doAction(insects.get(0));
                    PeachSingleton insectFood = PeachSingleton.getInstance();
                    insectFood.feed();
                    SatiatedState satiatedState = new SatiatedState();
                    satiatedState.doAction(insects.get(0));
                    System.out.println("You have successfully fed the insects in the garden");
                }
                else {
                    System.out.println("There are no insects in the garden to eat the food");
                }
                break;
            case 5:
                //command pattern to order the gardener
                System.out.println("You tell the gardener to water the hedges and trim them");
                Hedge hedges = new Hedge();
                WaterHedges waterHedgesOrder = new WaterHedges(hedges);
                TrimHedges trimHedges = new TrimHedges(hedges);
                Gardener gardener = new Gardener();
                gardener.takeOrder(waterHedgesOrder);
                gardener.takeOrder(trimHedges);
                gardener.placeOrders();
                break;
            case 6:
                System.out.println("Goodbye! Come back soon!");
                playing = false;
                break;
        }
    }
}
