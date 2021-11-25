package lab3_optional;


import javax.xml.stream.Location;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Church extends City implements Visitable {
    String name;
    private LocalTime oraDesc;
    private LocalTime oraInch;


    public String toString(){
        return "Church-->" + name + " deschide la ora  " + oraDesc + " si inchide la ora " + oraInch+ " si se afla in "+location+" .";
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