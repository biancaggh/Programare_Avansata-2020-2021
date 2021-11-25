package lab5_optional;

import java.io.IOException;

public class ListCommand {
    public static Object list(Catalog catalog) throws IOException {
        StringBuilder string = new StringBuilder();
        string.append("Name= " + catalog.getName() + " \n Path=" + catalog.getPath() + " \n");
        for (Item item : catalog.getItems()
        ) {
            string.append("name= " + item.getName() + " location " + item.getLocation() + "\n");

        }
        System.out.println(string.toString());
        return null;
    }
}
