package lab3_optional;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class City implements Classifiable,Visitable{
    String name;
    private String clasificare;
    private LocalTime oraDesc;
    private LocalTime oraInch;
    List<String> location= new ArrayList<>();


    public List<String> getLocation(List<String> location){
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }


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

    public Object Instanceofs() {
        List<LocalTime> object = new ArrayList<>();
        String[] time = new String[10];
        List<LocalTime> opening = new ArrayList<>();
        for (String locationList : location) {
            if ((location instanceof Visitable) && !(location instanceof Payable)) {
                object.add(((Visitable) location).getOraDesc());
            }
        }


        object.sort(null);
        return object;
    }
}
