import java.util.ArrayList;

public class Subject {
    private String title;
    private Person.Teacher teacher;
    private ArrayList<Person.Student> students;

    public Subject(String t, Person.Teacher te, ArrayList<Person.Student> st){
        title=t;
        teacher=te;
        students=st;
    }

    public String getTitle(){
        return title;
    }
    public String getNames(){
        //StringBuilder
        String result="";
        result+="Teacher: "+teacher.getFullName()+"\nStudents:\n";
        for(Person.Student student:students){
            result+=student.getFullName()+"\n";
        }
        return result;
    }

    public void addStudent(Person.Student student){
        students.add(student);
    }
}

