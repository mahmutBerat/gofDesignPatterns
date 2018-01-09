import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mahmut on 12/30/2017.
 */
public class test {

    public static boolean isValid(String name){
        final Pattern pattern = Pattern.compile("^[a-z][a-z\\d\\-]*[a-z\\d]+$", Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }
    public static boolean validate(String username) {
            if(username.length()<6 && username.length()>16){
                return false;
            }

            Pattern pattern = Pattern.compile("^[a-z][a-z\\d\\-]*[a-z\\d]+$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(username);
            return matcher.matches();
    }




    public static void main(String[] args) {
        System.out.println(validate("he s"));
    }
}
