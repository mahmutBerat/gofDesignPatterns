/**
 * Created by Mahmut on 1/2/2018.
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AirportTower();
        Colleague p1 = new Plane(mediator);
        Colleague p2 = new Plane(mediator);
    }
}
