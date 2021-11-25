package lab8_optional;

import java.sql.Date;

public class Genre {
    private int id;
    private String name;


    public int getId(){return this.id;}
    public String getName() {return this.name;}


    public Genre(int id, String name){
        this.id=id;
        this.name=name;
    }
}
