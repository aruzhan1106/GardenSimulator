public class RedTulipDecorator extends PlantDecorator{
    //This is the Subject class of our observer pattern implementation
    public RedTulipDecorator(Plant decoratedPlant) {
        super(decoratedPlant);
        decoratedPlant.notifyObserver();
    }
    @Override
    public void producePlant() {
        decoratedPlant.producePlant();
    }

    public String toString(){
        return "\uD83C\uDF37 There's a red tulip in the garden";
    }
}