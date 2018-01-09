import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmut on 1/2/2018.
 */
public abstract class Colleague {
    List myStates = new ArrayList();
    State myState;
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void receive(int i);

    public String send(Colleague s){
     return "";
    }
}
