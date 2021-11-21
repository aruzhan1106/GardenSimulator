public class TrimHedges implements Order{
    private Hedge hedgeBush;
    public TrimHedges(Hedge hedgeBush){
        this.hedgeBush = hedgeBush;
    }
    @Override
    public void execute() {
        hedgeBush.trimHedges();
    }
}
