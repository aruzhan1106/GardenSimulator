public class WaterHedges implements Order{
    private Hedge hedgeBush;
    public WaterHedges(Hedge hedgeBush){
        this.hedgeBush = hedgeBush;
    }
    @Override
    public void execute() {
        hedgeBush.waterHedges();
    }
}
