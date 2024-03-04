public class Cow extends Animal{
    public Cow(String n){
        super(n);
    }
    @Override
    public String sound(){
        return name + " muczy";
    }
}