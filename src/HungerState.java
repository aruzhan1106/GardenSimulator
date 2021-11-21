public class HungerState implements InsectState{
    public void doAction(Insect insect) {
        insect.setState(this);
        System.out.println("Insects are hungry");
    }
    public String toString(){
        return "Hunger State";
    }
}