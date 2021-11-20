public class RedPlantDecorator extends PlantDecorator{
    public RedPlantDecorator(Plant decoratedPlant) {
        super(decoratedPlant);
    }
    @Override
    public void producePlant() {
        decoratedPlant.producePlant();
        setRedBorder(decoratedPlant);
    }

    private void setRedBorder(Plant decoratedPlant){
        System.out.print(", colored red");
    }
}