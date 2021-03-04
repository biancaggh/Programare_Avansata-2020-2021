package lab3_compulsory;
import javax.xml.stream.Location;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Restaurant extends City implements Classifiable,Visitable{
    String name;
    private LocalTime oraDesc;
    private LocalTime oraInch;
    private String clasificare;

    public Restaurant(String name,LocalTime oraDesc,LocalTime oraInch,String clasificare){

        this.name=name;
        this.oraDesc=oraDesc;
        this.oraInch=oraInch;
        this.clasificare=clasificare;
    }
    public String toString(){
        return "Restaurant-->" + name + " , " + oraDesc + " , " + oraInch+ " , "+ clasificare;
    }

    HashMap<Object, Integer> map = new HashMap<Object, Integer>();



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
}
