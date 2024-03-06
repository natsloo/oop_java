public class Ellipse extends Shape{
    private double rx,ry;
    @Override
    public Point getBound(){
        return null;
    }
    @Override
    public String toSvg(){
        return null;
    }

    public Ellipse(Style style,Point center, double ry, double ry) {
        super(style);
        this.ry = ry;
    }
}
