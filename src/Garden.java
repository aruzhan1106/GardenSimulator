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
        System.out.println("＊*•̩̩͙✩•̩̩͙*˚　G A R D E N  ˚*•̩̩͙✩•̩̩͙*˚＊");
        System.out.println("What would you like to do?");
        System.out.println("1. Add Butterfly\n2. Add Flower\n3. Use Decorator\n4. Save Butterfly\n5. Exit");
        int userChoice;
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1: //create butterfly with abstract factory
                break;
            case 2: //create flower with abstract factory
                break;
            case 3: //change the color of butterfly or flower
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
