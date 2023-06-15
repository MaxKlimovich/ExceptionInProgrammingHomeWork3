package HomeWork3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;

public class FileCreator {
    public void FileCreator(Personaldata pd) throws Exception {

        if (pd != null) {
            String filename = pd.getLastname() + ".txt";

            // try(...) - try-with-resources - автоматически закрывает ресурсы, открытые в
            // блоке try
            try (FileWriter fw = new FileWriter(filename, Charset.forName("UTF8"), true)) {
                fw.write(pd.toString());
            } catch (IOException e) {

                try (FileWriter fw = new FileWriter(filename, Charset.forName("UTF8"), true)) {
                    try {
                        fw.write(pd.toString());
                    } catch (IOException e1) {

                        e1.printStackTrace();
                    }

                }
            }
        } else {
            throw new NullDataException();
        }

    }

}
