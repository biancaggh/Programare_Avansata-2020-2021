package lab5_optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws InvalidCatalogException, IOException {
        Main app = new Main();
        String path="D:\\movies\\catalog.ser";
        Catalog catalog =
                new Catalog("My Catalog", "D:\\movies\\catalog.ser");
        app.testCreateSave();
        app.testLoadView();
        app.testList();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Alege comanda:");
        String s = reader.readLine();
        if(s=="add"){
            System.out.println(addCommand.add());
        }
        if(s=="save"){
            System.out.println(saveCommand.save(catalog));
        }
        if(s=="list"){
            System.out.println(ListCommand.list(catalog));
        }
        if(s=="load"){
            System.out.println(loadCommand.load(path));
        }
        if(s=="play"){
            System.out.println(playCommand.play());
        }
    }

    //aceasta metoda salveaza elementele adaugate in catalog
    private void testCreateSave() throws IOException {
        Catalog catalog =
                new Catalog("My Catalog", "D:\\movies\\catalog.ser");
        Item book = new Book("Red Rising by Pierce Brown", "D:\\movies", 2013, "Pierce Brown");
        catalog.add(book);
        Item movie = new Movie("Hunger", 2008,7.6,"D:\\movies\\Hunger");
        catalog.add(movie);
        CatalogUtil.save(catalog);

    }

    // aceasta metoda deschide catalogul dintr un fisier extern
    private void testLoadView() throws InvalidCatalogException, IOException {
        Catalog catalog = CatalogUtil.load("D:\\movies\\catalog.ser");
        CatalogUtil.view(catalog.findById("Red Rising by Pierce Brown"));
    }

    //aceasta metoda listeaza elementele catalogului
    private void testList() throws IOException, InvalidCatalogException {
        Catalog catalog = CatalogUtil.load("D:\\movies\\catalog.ser");
        CatalogUtil.list(catalog);

    }
    
}
