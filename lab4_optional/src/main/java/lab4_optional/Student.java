package lab4_optional;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Student  {
    String nume;
    static LinkedList<Student> students=new LinkedList<Student>();
    private Comparator<? super String> compStudent;

    public Student() {
    }

    public Student(String s) {
        this.setNume(s);
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return  getNume();
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void compStudent(){
        students.sort((Comparator<? super Student>) compStudent);
    }


    public Iterator<Student> iterator(){
        return students.iterator();
    }
    public static <Student> void getStream(Student vect){
        Stream<Student> stream=Stream.of(vect);
        Iterator<Student> iterator= stream.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }

}

class compareStud implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getNume()!=o2.getNume()){
            return 1;
        }else{
            return -1;
        }
    }


}