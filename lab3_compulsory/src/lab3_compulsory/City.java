package lab3_compulsory;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class City implements Classifiable,Visitable{
    String name;
    private String clasificare;
    private LocalTime oraDesc;
    private LocalTime oraInch;


    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public List<String> location = new ArrayList<String>();

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }


    @Override
    public LocalTime getOraDesc() {
        return null;
    }

    public void setOraDesc(LocalTime oraDesc) {
        this.oraDesc = oraDesc;
    }

    @Override
    public LocalTime getOraInch() {
        return null;
    }

    public void setOraInch(LocalTime oraInch) {
        this.oraInch = oraInch;
    }

    @Override
    public String getClasificare() {
        return clasificare;
    }

    public void setClasificare(String clasificare) {
        this.clasificare = clasificare;
    }
}
