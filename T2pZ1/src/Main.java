import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
    //Person one=new Person("Natalia", "Kuśmierczyk");
        //sout skrót od System.out.println() + tab;
        //System.out.println(one);
        Person.Teacher teacher = new Person.Teacher("Iwona", "Filip");

        ArrayList<Person.Student> students = new ArrayList<>();
        students.add(new Person.Student("Natalia","Kuśmierczyk"));
        students.add(new Person.Student("Łukasz","Bałabuch"));
        students.add(new Person.Student("Zuzanna", "Lachowska"));

    Subject english = new Subject("English",teacher,students);
        System.out.println(english.getTitle());
        System.out.println(english.getNames());
}
}