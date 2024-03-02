public class Person {
    private String name;
    private String surname;

    public Person(String n, String s) {
        surname=s;
        name=n;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public static class Teacher extends Person{
        public Teacher (String name, String surname){
            super(name, surname);
        }
    }

    public static class Student extends Person{
        public Student(String name, String surname){
            super(name, surname);
        }
    }
}
