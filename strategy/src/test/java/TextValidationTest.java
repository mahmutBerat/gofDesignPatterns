import com.password.entity.DateText;
import com.password.entity.TextType;
import com.password.strategy.DateValidator;
import com.password.strategy.NumericValidator;
import org.junit.Test;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class TextValidationTest {

    @Test
    public void textValidate(){
        TextType textType = new DateText();
        textType.setValue("Carrel");
        textType.setStrategy(new DateValidator());
        textType.validate();
        textType.setStrategy(new NumericValidator());
        textType.validate();
        textType.setStrategy(new DateValidator());
        textType.validate();
    }
}
