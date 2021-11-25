package lab5_compulsory;


import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Movie, Book{
    private static String path;
    private static List<Item> itemsList=new ArrayList<Item>();
    Catalog(){}
    @Override
    public String getTitle() {
        return getTitle();
    }

    @Override
    public String getAuthorName() {
        return getAuthorName();
    }

    @Override
    public int getReleaseYearBook() {
        return getReleaseYearBook();
    }

    @Override
    public String getSagaName() {
        return getSagaName();
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public int getReleaseYear() {
        return getReleaseYear();
    }

    @Override
    public double getRanting() {
        return getRanting();
    }

    @Override
    public String getNameDirector() {
        return getNameDirector();
    }

    public static void add(Item item){
        itemsList.add(item);
    }

    public static void list(){
        System.out.println(itemsList);
    }

    public static boolean play() throws IOException{
        if(GraphicsEnvironment.isHeadless())
            return true;
        return true;
    }

    public static boolean save(Catalog catalog) throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(Catalog.getPath()))) {
            oos.writeObject(itemsList);
    }


}

    private static String getPath() {
        return path;
    }
}

