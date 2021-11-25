package lab5_optional;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class playCommand {
    public static Object play() throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File("D:\\movies"));
        return null;
    }
}
