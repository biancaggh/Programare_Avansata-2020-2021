package lab3_compulsory;

import javax.xml.stream.Location;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Church extends City implements Visitable {
    String name;
    private LocalTime oraDesc;
    private LocalTime oraInch;

    public Church(String name, LocalTime oraDesc, LocalTime oraInch){

        this.name=name;
        this.oraDesc=oraDesc;
        this.oraInch=oraInch;
    }

    public String toString(){
        return "Church-->" + name + " , " + oraDesc + " , " + oraInch;
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

}
