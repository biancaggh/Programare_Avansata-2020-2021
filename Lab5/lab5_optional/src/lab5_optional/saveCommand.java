package lab5_optional;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class saveCommand {
    public static Object save(Catalog catalog)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
        return null;
    }
}
