package HomeWork3;

import java.util.ArrayList;

public class Creator {
    public static Personaldata Create(ArrayList<String> data) throws Exception {
        Personaldata pd = new Personaldata("", "", "", "", Long.parseLong("0"), "");

        try {
            ArrayList<Object> data_n = Parser.parse(data);
            pd.setLastname((String) data_n.get(0));
            pd.setName((String) data_n.get(1));
            pd.setSurname((String) data_n.get(2));
            pd.setBirthdate((String) data_n.get(3));
            pd.setPhone((Long) data_n.get(4));
            pd.setSex((String) data_n.get(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pd;
    }
}