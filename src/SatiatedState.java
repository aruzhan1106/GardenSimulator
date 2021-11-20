public class SatiatedState implements InsectState{
    public void doAction(Insect insect) {
        System.out.println("Player is in stop state");
        insect.setState(this);
    }
    public String toString(){
        return "Satiated State";
    }
}
