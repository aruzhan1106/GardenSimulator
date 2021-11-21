public class Rose implements Plant{
    @Override
    public void producePlant() {
        System.out.println(" \uD83C\uDF39 You have added a white rose to the garden");
    }

    @Override
    public String toString() {
        return " \uD83C\uDF39 There's a white rose in the garden";
    }
    public String getFlowerType() {
        return "Rose";
    }
    public void notifyObserver(){
        System.out.println("\nYou have changed the flower's color\n");
    }
}