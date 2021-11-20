public class HungerState implements InsectState{
    public void doAction(Insect insect) {
        System.out.println("Player is in stop state");
        insect.setState(this);
    }
    public String toString(){
        return "Hunger State";
    }
}
