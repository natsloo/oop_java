//import java.util.Locale;
//
//public class Ellipse extends Shape{
//
//    private Point center;
//    private double rx,ry;
//    @Override
//    public Point getBound() {
//        return new Point(center.x +rx+ style.strokeWidth,center.y+ry+ style.strokeWidth);
//    }
//    @Override
//    public String toSvg(){
//        return String.format(Locale.ENGLISH,"<ellipse rx=\"%f\" ry=\"%f\" cx=\"%f\" cy=\"%f\"\n\" + style=\"%s\" />",rx,ry,center.x,center.y, style.toSvg());
//    }
//
//    public Ellipse(Point center, double rx, double ry) {
//        this.center=center;
//        this.rx=rx;
//        this.ry = ry;
//    }
//}
import java.util.Locale;

public class Ellipse implements Shape{
    private Vec2 center;
    private double rx, ry;
    @Override
    public Vec2 getBound() {
        return new Vec2(center.x + rx, center.y + ry);
    }

    @Override
    public String toSvg(String param) {
        return String.format(Locale.ENGLISH,"<ellipse rx=\"%f\" ry=\"%f\" cx=\"%f\" cy=\"%f\" %s/>",
                rx,ry,center.x,center.y,param);
    }
    /*public String toSvg(String param){
        //TODO :potem

    }*/
    public Ellipse(Vec2 center, double rx, double ry) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }
}