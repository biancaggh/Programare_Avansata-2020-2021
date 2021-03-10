package lab4_compulsory;


import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class School implements Comparable<String> {
    String name;
    int capacity;
    String[] pref;
    TreeSet<String> highschool=new TreeSet<String>();


    void String(int c){
        c=capacity;
    }


    public String getName() {
        return name;
    }

    public void setName(String school) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String[] getPref() {
        return pref;
    }

    public void setPref(String[] pref) {
        this.pref = pref;
    }

    @Override
    public String toString() {
        return "school='" + "capacity(" +name+")="+ capacity +'}';
    }

    public TreeSet<String> getHighschool() {
        return highschool;
    }

    public void setHighschool(TreeSet<String> highschool) {
        this.highschool = highschool;
    }
    public void addHighschool(String name){
        highschool.add(name);
    }
    public static <String> void getStream_h(String[] sch){
        Stream<String> stream=Stream.of(sch);
        Iterator<String> iterator=stream.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }

    public School compareTo(School o1, School o2) {
        if(o1.capacity>o2.capacity)
            return o2;
        else return o1;
    }

    @Override
    public int compareTo(String o) {
        return capacity;
    }

}
