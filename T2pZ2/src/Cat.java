public class Cat extends Animal{
    public Cat(String n){
        super(n);
    }
    @Override
    public String sound(){
        return name + " miauczy";
    }
}