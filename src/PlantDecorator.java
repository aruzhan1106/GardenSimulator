public class PlantDecorator implements Plant{
    Plant decoratedPlant;
    public PlantDecorator(Plant decoratedPlant){
        this.decoratedPlant = decoratedPlant;
    }
    @Override
    public void producePlant() {
        decoratedPlant.producePlant();
    }
}
