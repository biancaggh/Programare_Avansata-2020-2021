package lab3_optional;

import javax.xml.stream.Location;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Restaurant extends City implements Classifiable,Visitable{
    String name;
    private LocalTime oraDesc;
    private LocalTime oraInch;
    private String clasificare;

    public String toString(){
        return "Restaurant-->" + name + " este deschis la ora " + oraDesc + " , se inchide la  " + oraInch+ " , fiind un restaurant de "+ clasificare + " aflat in"+location+".";
    }


    public List Location()
    {
        City c=new City();
        return location;
    }

    String getName(){return name;}
    void setName(String name){this.name=name;}

    @Override
    public String getClasificare() {
        return clasificare;
    }

    public void setClasificare(String clasificare) {
        this.clasificare = clasificare;
    }

    @Override
    public LocalTime getOraDesc() {
        return oraDesc;
    }

    public void setOraDesc(LocalTime oraDesc) {
        this.oraDesc = oraDesc;
    }

    @Override
    public LocalTime getOraInch() {
        return oraInch;
    }

    public void setOraInch(LocalTime oraInch) {
        this.oraInch = oraInch;
    }
}
