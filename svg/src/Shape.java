public abstract class Shape {
    final protected Style style; //protected daje dostep ze wszystkich dziedziczacych klas

    protected Shape(Style style) {
        this.style = style;
    }
    public Shape(){
        this.style=new Style();
    }
    @Override //nadpisywanie funkcji nadrzednej
    public abstract Point getBound();
    @Override
    abstract public String toSvg();
}
