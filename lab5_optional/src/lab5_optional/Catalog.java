package lab5_optional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Item> items = new ArrayList<>();

    //constructori
    Catalog() {
    }

    Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    //comanda add pentru a adauga elemente in catalog
    public void add(Item item) {
        getItems().add(item);
    }

    //metoda findById pentru a gasi un element din catalog
    public Item findById(String name) {
        return items.stream()
                .filter(d -> d.getName().equals(name)).findFirst().orElse(null);

    }

    //setteri si getteri
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
