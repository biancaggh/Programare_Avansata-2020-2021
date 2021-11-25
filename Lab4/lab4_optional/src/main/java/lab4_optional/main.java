package lab4_optional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.javafaker.Faker;
import static lab4_optional.School.getStream_h;
import static lab4_optional.Student.getStream;

public class main {


    public static void main(String[] args){
        //cu ajutorul stream ului
        Student[] students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i) )
                .toArray(Student[]::new);
        System.out.println("Lista studentilor:");
        for (Student s1:students) {
            System.out.println(s1);
        }

        System.out.println("");

        School[] schools = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new School("H" + i) )
                .toArray(School[]::new);
        System.out.println("Lista liceelor:");
        for (School s1: schools) {
            System.out.println(s1);
        }
        System.out.println("");

        System.out.println("Metoda 1:");
        System.out.println("");
        System.out.println("Preferintele studentilor:");
        Map<Student, List<School>> stdPrefMap = new HashMap<>();
        List<School> prefList = new ArrayList<>();
        prefList.add(schools[0]);
        prefList.add(schools[1]);
        prefList.add(schools[2]);
        stdPrefMap.put(students[0], prefList);
        stdPrefMap.put(students[1], prefList);
        stdPrefMap.put(students[2], prefList.subList(0, 2));
        stdPrefMap.put(students[3], Arrays.asList(schools[0], schools[2]));
        System.out.println(stdPrefMap);
        System.out.println("");

        System.out.println("Preferintele liceelor:");
        Map<School, List<Student>> schpref = new HashMap<>();
        List<Student> pref = new ArrayList<>();
        pref.add(students[0]);
        pref.add(students[1]);
        pref.add(students[2]);
        pref.add(students[3]);
        schpref.put(schools[0], Arrays.asList(students[3],students[0],students[1],students[2]));
        schpref.put(schools[1], Arrays.asList(students[0],students[2],students[1]));
        schpref.put(schools[2], Arrays.asList(students[0],students[1],students[3]));
        System.out.println(schpref);
        System.out.println("");


        Problem p=new Problem();

        p.setSchoolList(p.getSchoolList());
        p.setStudentList(p.getStudentList());
        p.setSchprio(schpref);
        p.setStudprio(stdPrefMap);
        Map<School,Integer> capacities = new HashMap<>();

        capacities.put(schools[0],1 );
        capacities.put(schools[1],2 );
        capacities.put(schools[2],2 );
        p.setCapacities(capacities);

        Map<Student,Integer> score = new HashMap<>();
        score.put(students[0],91);
        score.put(students[1],93 );
        score.put(students[2],95);
        score.put(students[3],89 );
        p.setScore(score);
        System.out.println("Metoda 2:");
        System.out.println("");
        System.out.println(p.toString());
        System.out.println("");
        System.out.println("Punctajele studentilor:");
        System.out.println(p.setScore(score));
        System.out.println("");
        System.out.println("Capacitatile liceelor:");
        System.out.println(p.setCapacities(capacities));
        System.out.println("");

        Faker faker = new Faker();
        System.out.println("Nume studenti:");
        students[0].setNume(faker.name().fullName());
        System.out.println(students[0].getNume());
        students[1].setNume(faker.name().fullName());
        System.out.println(students[1].getNume());
        students[2].setNume(faker.name().fullName());
        System.out.println(students[2].getNume());
        students[3].setNume(faker.name().fullName());
        System.out.println(students[3].getNume());
        System.out.println("");
        System.out.println("Nume licee:");
        schools[0].setName(faker.university().name());
        System.out.println( schools[0].getName());
        schools[1].setName(faker.university().name());
        System.out.println( schools[1].getName());
        schools[2].setName(faker.university().name());
        System.out.println( schools[2].getName());

    }
}