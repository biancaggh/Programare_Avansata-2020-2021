package lab5_optional;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class loadCommand {
    public static Catalog load(String path)
            throws InvalidCatalogException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(path));
        } catch (IOException e) {
            throw new InvalidCatalogException(e);
        }
        Catalog catalog = null;
        try {
            catalog = (Catalog) ois.readObject();
        } catch (IOException e) {
            throw new InvalidCatalogException(e);
        } catch (ClassNotFoundException e) {
            throw new InvalidCatalogException(e);
        }
        return catalog;
    }
}
