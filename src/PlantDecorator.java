public class PlantDecorator implements Plant{
    Plant decoratedPlant;
    public PlantDecorator(Plant decoratedPlant){
        this.decoratedPlant = decoratedPlant;
    }
    @Override
    public void producePlant() {
        decoratedPlant.producePlant();
    }

    @Override
    public String getFlowerType() {
        //This does nothing
        return null;
    }

    @Override
    public void notifyObserver() {
        //This does nothing
    }
}
