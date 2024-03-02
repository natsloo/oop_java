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
}
