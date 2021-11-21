public class PinkRoseDecorator extends PlantDecorator{
    //This is the Subject class of our observer pattern implementation
    public PinkRoseDecorator(Plant decoratedPlant) {
        super(decoratedPlant);
        decoratedPlant.notifyObserver();
    }
    @Override
    public void producePlant() {
        decoratedPlant.producePlant();
    }

    public String toString(){
        return "\uD83C\uDF37 There's a pink rose in the garden";
    }
}
