public class SatiatedState implements InsectState{
    public void doAction(Insect insect) {
        System.out.println("Insects are satiated");
        insect.setState(this);
    }
    public String toString(){
        return "Satiated State";
    }
}
