package lab4_compulsory;


import java.util.*;

import static lab4_compulsory.School.getStream_h;
import static lab4_compulsory.Student.getStream;

public class main {


    public static void main(String[] args){
        //cu ajutorul stream ului
        String[] stud=new String[]{"S0","S1","S2","S3"};
        System.out.println("Lista studentilor:");
        getStream(stud);
        System.out.println("");

        String[] sch=new String[]{"H0","H1","H2"};
        System.out.println("Lista liceelor:");
        getStream_h(sch);

        Student s=new Student();
        s.addStudent("SO");
        s.addStudent("S1");
        s.addStudent("S2");
        s.addStudent("S3");
        s.compStudent();
        System.out.println("Lista sortata e:");
        for(String s1:stud){
            System.out.println(s1);
        }

        School sc=new School();
        sc.addHighschool("HO");
        sc.addHighschool("H1");
        sc.addHighschool("H2");
        System.out.println(sc.compareTo("H0"));

        System.out.println("Preferintele studentilor:");
        Map<String, List<String>> stdPrefMap = new HashMap<>();
        List<String> prefList = new ArrayList<>();
        prefList.add("HO");
        prefList.add("H1");
        prefList.add("H2");
        stdPrefMap.put("S0", prefList);
        stdPrefMap.put("S1", prefList);
        stdPrefMap.put("S2", prefList.subList(0, 2));
        stdPrefMap.put("S3", Arrays.asList("H0", "H2"));
        System.out.println(stdPrefMap);

        System.out.println("Preferintele studentilor:");
        Map<String, List<String>> schpref = new HashMap<>();
        List<String> pref = new ArrayList<>();
        pref.add("S0");
        pref.add("S1");
        pref.add("S2");
        pref.add("S3");
        schpref.put("H0", Arrays.asList("S3","S0","S1","S2"));
        schpref.put("H1", Arrays.asList("S0","S2","S1"));
        schpref.put("H2", Arrays.asList("S0","S1","S3"));
        System.out.println(schpref);
    }
}
