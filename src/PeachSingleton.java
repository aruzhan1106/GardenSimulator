public class PeachSingleton {
    private static final PeachSingleton peach = new PeachSingleton();
    private PeachSingleton(){}
    public static PeachSingleton getInstance(){
        return peach;
    }
    public void feed(){
        System.out.println("A peach is given to insects in the garden");
    }
}
