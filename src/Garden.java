import java.util.Scanner;

public class Garden {
    private boolean playing;
    public Garden(){
        playing = true;
    }
    public boolean isPlaying() {
        return playing;
    }
    public void mainMenu(){
        System.out.println("\n＊*•̩̩͙✩•̩̩͙*˚　G A R D E N  ˚*•̩̩͙✩•̩̩͙*˚＊");
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Add Butterfly\n2. Add Flower\n3. Change Color of a Flower\n4. Save Butterfly\n5. Exit");
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
                    }
                    case 2 ->{
                        Insect insect2 = gardenFactory1.getInsect("Bumblebee");
                        insect2.produceInsect();
                    }
                }
                break;
            case 2:
                //create flower with abstract factory
                System.out.println("What kind of flower do you want to add to the garden?");
                System.out.println("\n1. Rose\n2. Peony");
                AbstractGardenFactory gardenFactory2 = FactoryProducer.getFactory(false);
                int flowerChoice = scanner.nextInt();
                switch (flowerChoice) {
                    case 1 -> {
                        Plant plant1 = gardenFactory2.getPlant("Rose");
                        plant1.producePlant();
                    }
                    case 2 -> {
                        Plant plant2 = gardenFactory2.getPlant("Peony");
                        plant2.producePlant();
                    }
                }
                break;
            case 3: //change the color of a flower
                break;
            case 4: //use memento pattern to save object state
                break;
            case 5:
                System.out.println("Goodbye! Come back soon!");
                playing = false;
                break;
        }
    }
}
