package lab4_optional;


import java.util.List;
import java.util.Map;

public class Problem {
    private List<Student> studentList;
    private List<School> schoolList;
    private Map<School,Integer> capacities;
    private Map<Student,List<School>> studprio;
    private Map<School,List<Student>> schprio;
    private Map<Student, Integer> score;


    public Map<Student, Integer> getScore() {
        return score;
    }

    public Map<Student, Integer> setScore(Map<Student, Integer> score) {
        this.score = score;
        return score;
    }



    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public Map<School,Integer> getCapacities() {
        return (Map<School, Integer>) capacities;
    }

    public Map<School,Integer> setCapacities(Map<School,Integer> capacities) {
        this.capacities = capacities;
        return capacities;
    }

    public Map<Student, List<School>> getStudprio() {
        return studprio;
    }

    public void setStudprio(Map<Student, List<School>> studprio) {
        this.studprio = studprio;
    }

    public Map<School, List<Student>> getSchprio() {
        return schprio;
    }

    public void setSchprio(Map<School, List<Student>> schprio) {
        this.schprio = schprio;
    }




    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Preferintele studentilor:\n");
        studprio.forEach((student, schools1) -> {
            string.append(student.getNume() + ":(");
            for (School school : schools1)
                string.append(school.getName() + ", ");
            string.delete(string.length()-2,string.length());
            string.append(")\n");
        });


        StringBuilder sch = new StringBuilder();
        sch.append("Preferintele liceelor:\n");
        schprio.forEach((school, students1) -> {
            sch.append(school.getName() + ":(");
            for (Student student : students1)
                sch.append(student.getNume() + ", ");
            sch.delete(sch.length()-2,sch.length());
            sch.append(")\n");
        });

        System.out.println(sch.toString());
        return string.toString();
    }
}

