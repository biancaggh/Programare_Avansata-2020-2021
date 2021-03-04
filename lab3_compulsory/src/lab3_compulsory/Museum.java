package lab3_compulsory;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Museum extends City implements Visitable,Payable{
    String name;
    private LocalTime oraDesc;
    private LocalTime oraInch;
    private double pretIntrare;

    public Museum(String name,LocalTime oraDesc, LocalTime oraInch, double pretIntrare, List location){
        this.name=name;
        this.oraDesc=oraDesc;
        this.oraInch=oraInch;
        this.pretIntrare=pretIntrare;
        this.location=location;
    }

    public String toString(){
        return  "Museum-->" + name + " , " + oraDesc + " , " + oraInch+ " , "+ pretIntrare + " , " + location;
    }

    HashMap<Object, Integer> map = new HashMap<Object, Integer>();



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

    @Override
    public double getPretIntrare() {
        return pretIntrare;
    }

    public void setPretIntrare(double pretIntrare) {
        this.pretIntrare = pretIntrare;
    }


}
