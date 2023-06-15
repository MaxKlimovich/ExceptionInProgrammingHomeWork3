package HomeWork3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] list = s.split(" +");

        ArrayList<String> data = new ArrayList<String>();
        for (String input_data : list) {
            data.add(input_data.strip());

        }

        Creator c = new Creator();
        Personaldata pd = c.Create(data);
        FileCreator fc = new FileCreator();
        fc.FileCreator(pd);
        scan.close();

    }
}