public class Tulip implements Plant{
    @Override
    public void producePlant() {
        System.out.println(" \uD83C\uDF37 You have added a white tulip to the garden");
    }
    public String toString() {
        return " \uD83C\uDF37 There's a white tulip in the garden";
    }
    public String getFlowerType() {
        return "Tulip";
    }
    public void notifyObserver(){
        System.out.println("\nYou have changed the flower's color\n");
    }
}