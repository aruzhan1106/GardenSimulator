public class InsectFactory extends AbstractGardenFactory{
    @Override
    public Insect getInsect(String type) {
        //This is going to return an insect
        if(type.equalsIgnoreCase("Butterfly")){
            return new Butterfly();
        }else if(type.equalsIgnoreCase("Bumblebee")){
            return new Bumblebee();
        }
        return null;
    }

    @Override
    public Plant getPlant(String type) {
        //This does nothing
        return null;
    }
}
