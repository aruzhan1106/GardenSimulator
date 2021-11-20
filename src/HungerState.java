public class HungerState implements InsectState{
    public void doAction(Insect insect) {
        System.out.println("Insects are hungry");
        insect.setState(this);
    }
    public String toString(){
        return "Hunger State";
    }
}