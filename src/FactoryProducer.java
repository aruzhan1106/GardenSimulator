public class FactoryProducer {
    public static AbstractGardenFactory getFactory(boolean flying){
        if(flying){
            return new InsectFactory();
        }else{
            return new PlantFactory();
        }
    }
}
