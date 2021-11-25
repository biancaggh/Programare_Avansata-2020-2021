package lab5_optional;


import java.io.Serializable;

//clasa Image mosteneste Item
public class Movie extends Item implements Serializable {
    private String name;
    private int release;
    private double ranting;
    private String location;

    //constructori
    Movie() {
    }

    Movie(String name, int release,double ranting, String location) {
        this.name = name;
        this.release=release;
        this.ranting=ranting;
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

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }


    public double getRanting() {
        return ranting;
    }

    public void setRanting(double ranting) {
        this.ranting = ranting;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {

    }

    @Override
    public String toString() {
        return "Movie-->" + name + " " + release + " " + ranting + " " + location ;
    }
}