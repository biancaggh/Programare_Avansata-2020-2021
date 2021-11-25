package lab3_compulsory;

import java.util.HashMap;
import java.util.List;

public class Hotel extends City implements Classifiable{
    String name;
    private String clasificare;

    HashMap<Object, Integer> map = new HashMap<Object, Integer>();

    public Hotel(String name, String clasificare, List location){
        this.name=name;
        this.clasificare=clasificare;
        this.location=location;
    }
    public String toString() {
        return "Hotel-->" + name + " , " + clasificare;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }


    @Override
    public String getClasificare() {
        return clasificare;
    }

    public void setClasificare(String clasificare) {
        this.clasificare = clasificare;
    }
}
