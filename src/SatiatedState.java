public class SatiatedState implements InsectState{
    public void doAction(Insect insect) {
        insect.setState(this);
        System.out.println("Insects are satiated");
    }
    public String toString(){
        return "Satiated State";
    }
}
