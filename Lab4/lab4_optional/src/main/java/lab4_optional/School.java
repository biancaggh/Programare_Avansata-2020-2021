package lab4_optional;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class School implements Comparable<String> {
    String name;
    String[] pref;
    static TreeSet<School> highschool=new TreeSet<School>();

    public School(){}

    public School(String s) {
        this.setName(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPref() {
        return pref;
    }

    public void setPref(String[] pref) {
        this.pref = pref;
    }

    @Override
    public String toString() {
        return name;
    }

    public TreeSet<School> getHighschool() {
        return highschool;
    }

    public void setHighschool(TreeSet<School> highschool) {
        this.highschool = highschool;
    }
    public void addHighschool(School school){
        highschool.add(school);
    }
    public static <School> void getStream_h(School[] sch){
        Stream<School> stream=Stream.of(sch);
        Iterator<School> iterator=stream.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
