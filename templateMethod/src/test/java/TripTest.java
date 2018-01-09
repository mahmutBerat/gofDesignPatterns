import com.Trip;
import com.password.TourA;
import com.password.TourB;
import org.junit.Test;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class TripTest {

    @Test
    public void testTrip(){
        Trip t1 = new TourA();
        Trip t2 = new TourB();

        t1.performTrip();
        System.out.println("***");
        t2.performTrip();

    }


}
