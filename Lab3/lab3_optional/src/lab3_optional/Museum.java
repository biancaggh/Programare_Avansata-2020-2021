package lab3_optional;


import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Museum extends City implements Visitable,Payable{
    String name;
    private LocalTime oraDesc;
    private LocalTime oraInch;
    private double pretIntrare;

    public String toString(){
        return  "Museum-->" + name + " se deschide la ora " + oraDesc + " , se inchide la ora " + oraInch+ " ,pretul fiind de "+ pretIntrare + " lei si se afla in " + location+".";
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

    @Override
    public double getPretIntrare() {
        return pretIntrare;
    }

    public void setPretIntrare(double pretIntrare) {
        this.pretIntrare = pretIntrare;
    }


}