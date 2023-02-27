import java.util.Date;

public class Worktasks extends Tasks implements Notifiable {

    enum Notify {
        on, off
    }

    private Notify notify;

    public Worktasks (String theme, Date startDate, Date finishtDate, String responsible) {
        super(theme, startDate, finishtDate, responsible);
        this.notify = Notify.off;
    }

    public void notifOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifOn'");
    }

    @Override
    public void notifyOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyOff'");
    }
}
