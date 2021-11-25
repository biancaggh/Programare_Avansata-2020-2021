package lab5_optional;

import java.io.Serializable;

public class Book extends Item implements Serializable {
    private String name;
    private Integer an;
    private String autor;
    private String location;

    //constructori
    Book() {
    }

    Book(String name, String location, Integer an, String autor) {
        this.name = name;
        this.setAn(an);
        this.setAutor(autor);
        this.location = location;
    }



    //setteri si getteri
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {

    }


    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book-->" + name + " " +an + " "+ autor  +" "+ location ;
    }
}
