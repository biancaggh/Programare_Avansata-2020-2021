package lab4_compulsory;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Student  {
    String nume;
    String[] preference;
    LinkedList<String> students=new LinkedList<String>();
    private Comparator<? super String> compStudent;

    public String getNume() {
        return nume;
    }

    public void setNume(String student) {
        this.nume = nume;
    }

    public String[] getPreference() {
        return preference;
    }

    public void setPreference(String[] preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        return "student='" + nume + '\'' + preference;
    }

    public LinkedList<String> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<String> students) {
        this.students = students;
    }
    public void addStudent(String student){
        students.add(student);
    }
    public void compStudent(){
        Collections.sort(students,compStudent);
    }


    public Iterator<String> iterator(){
        return students.iterator();
    }
    public static <String> void getStream(String[] vect){
        Stream<String> stream=Stream.of(vect);
        Iterator<String> iterator= stream.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }

}

class compareStud implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getNume() != o2.getNume()) {
            return 1;
        } else {
            return -1;
        }
    }

}
