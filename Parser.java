package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static ArrayList<Object> parse(ArrayList<String> list) throws Exception {
        if (list.size() < 6) {
            throw new FewInfoException();
        }
        if (list.size() > 6) {
            throw new ExcessInfoException();
        }
        HashMap<Object, Object> map = new HashMap<>();
        map.put("Фамилия", "");
        map.put("Имя", "");
        map.put("Отчество", "");
        map.put("Номер телефона", null);
        map.put("Дата рождения", "");
        map.put("Пол", "");
        for (int i = 0; i < list.size(); i++) {
            isInteger in = new isInteger();
            if (in.isInteger(list.get(i))) {
                Long number = Long.parseLong(list.get(i));
                if (list.get(i).length() < 10 || list.get(i).length() > 15) {
                    throw new LengthNumberException();
                }
                map.put("Номер телефона", number);
                list.remove(i);
                i -= 1;
                continue;
            }
            isDate d = new isDate();
            Pattern pattern = Pattern.compile("\\d{1,}");
            Matcher matcher = pattern.matcher(list.get(i));
            if (matcher.find()) {
                if (d.isDate(list.get(i))) {
                    map.put("Дата рождения", list.get(i));
                    list.remove(i);
                    i -= 1;
                    continue;
                } else {
                    throw new DateFormatException();
                }
            }
            isGender g = new isGender();
            if (list.get(i).length() == 1) {
                if (g.isGender(list.get(i))) {
                    map.put("Пол", list.get(i).toLowerCase());
                    list.remove(i);
                    i -= 1;
                    continue;
                } else {
                    throw new GenderFormatException();
                }
            }

        }

        map.put("Фамилия", list.get(0));
        map.put("Имя", list.get(1));
        map.put("Отчество", list.get(2));
        ArrayList<Object> data = new ArrayList<Object>();
        // <Фамилия, Имя, Отчество, дата рождения, Номер телефона, пол>
        data.add(map.get("Фамилия"));
        data.add(map.get("Имя"));
        data.add(map.get("Отчество"));
        data.add(map.get("Дата рождения"));
        data.add(map.get("Номер телефона"));
        data.add(map.get("Пол"));
        return data;
    }

}
