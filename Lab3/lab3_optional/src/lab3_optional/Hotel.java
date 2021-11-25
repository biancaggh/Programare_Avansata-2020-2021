package lab3_optional;

import javax.xml.stream.Location;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Hotel extends City implements Classifiable{
    String name;
    private String clasificare;
    City c=new City();

    public String toString() {
        return "Hotel-->" + name + " este un hotel de " + clasificare+ " si se afla in "+location;
    }

    public List Location()
    {
        City c=new City();
        return location;
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

    public void location(String location) {
        this.c.location= Collections.singletonList(location);
    }
}
