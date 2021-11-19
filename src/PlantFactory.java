public class PlantFactory extends AbstractGardenFactory{
    @Override
    public Plant getPlant(String type) {
        //This is going to return a plant
        if(type.equalsIgnoreCase("Rose")){
            return new Rose();
        }else if(type.equalsIgnoreCase("Peony")){
            return new Peony();
        }
        return null;
    }
    @Override
    public Insect getInsect(String type) {
        //This does nothing
        return null;
    }
}
