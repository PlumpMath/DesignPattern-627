package ObserverPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
