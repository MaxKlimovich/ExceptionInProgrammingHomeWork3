package HomeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class isDate {
    public boolean isDate(String input) {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        try {
            Date docDate = format.parse(input);
            int day = Integer.parseInt((input.substring(0, 2)));
            int month = Integer.parseInt((input.substring(3, 5)));
            int year = Integer.parseInt((input.substring(6)));

            if (((day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12))
                    || (month == 2 && day <= 29)
                    || (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)))
                    && year <= LocalDate.now().getYear() && input.substring(6).length() < 5) {
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            return false;

        }

    }

}
