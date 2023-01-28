
public class FactionDelhomeEvent() extends FactionEvent implements Cancellable {

    private boolean cancelled;
    public FactionDelhomeEvent(Faction faction) {
        super(faction);
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


}
