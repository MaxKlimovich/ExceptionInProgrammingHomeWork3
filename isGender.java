package HomeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class isGender {
    public boolean isGender(String input) {

        if (input.length() == 1 && ((int) (char) input.toLowerCase().charAt(0) == 102
                || (int) input.toLowerCase().charAt(0) == 109)) {

            return true;
        } else {
            return false;

        }

    }

}
