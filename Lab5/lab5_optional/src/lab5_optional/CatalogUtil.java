package lab5_optional;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.*;


public class CatalogUtil extends Catalog implements Serializable {
    //aceasta metoda va salva elementele catalogului
    public static void save(Catalog catalog)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }


    //aceasta metoda va afisa catalogul dintr un fisier  si va intampina exceptii
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

    public static void view(Item item) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File(item.getLocation()));
    }

    //aceasta metoda va lista elementele catalogului,inclusiv numele si locatia lor
    public static void list(Catalog catalog) throws IOException {
        StringBuilder string = new StringBuilder();
        string.append("Name= " + catalog.getName() + " \n Path=" + catalog.getPath() + " \n");
        for (Item item : catalog.getItems()
        ) {
            string.append("name= " + item.getName() + " location " + item.getLocation() + "\n");

        }
        System.out.println(string.toString());
    }
}
