import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmut on 1/3/2018.
 */
public class Alliance {

    List regularObserver = new ArrayList();
    List goldObserver = new ArrayList();
    List platiniumObserver = new ArrayList();


    public void notifys(List observerList){
        for (observer: observerList) {
//            observer.update();
        }
    }
}
