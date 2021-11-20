public abstract class Insect {
    private InsectState state;
    public Insect(){
        state = null;
    }
    public void setState(InsectState state){
        this.state = state;
    }
    public InsectState getState(){
        return state;
    }
    abstract void produceInsect();
}
