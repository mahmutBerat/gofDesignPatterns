/**
 * Created by Mahmut on 1/2/2018.
 */
public class Plane extends Colleague {
    public Plane(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(int latestState) {
        changeState(latestState);
        send(this);
    }
    private void changeState(int index){
        myState = (State) myStates.get(index+1);
    }
}
