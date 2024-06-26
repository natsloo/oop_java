//import java.util.Locale;
//
//public class Polygon extends Shape{
//    private Point[] points;
//    //private Style style;
//
//    public Polygon(Point[] points) {
//        this.points = points;
//
//        //this.style=new Style();
//    }
//    public Polygon(Point[] points, Style style){
//        super(style); //wywolanie konstruktora nadrzednego
//        this.points=points;
//        //this.style=style;
//    }
//    @Override //nadpisywanie funkcji nadrzednej
//    public Point getBound() {
//        double x = 0, y = 0;
//        for (int i = 0; i < points.length; i++) {
//            x = Math.max(x, points[i].x);
//            y = Math.max(y, points[i].y);
//        }
//        return new Point(x,y);
//    }
//    @Override
//    public String toSvg(){
//        String result = "";
//        for(int i=0;i<this.points.length;i++)
//        {
//            result+=String.format(Locale.ENGLISH, "%f,%f " ,points[i].x,points[i].y);
//        }
//        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"%s/>", result,style.toSvg());
//    }
//}
//
////<polygon points="200,10 250,190 150,190" style="fill:lime;stroke:purple;stroke-width:3" />

import java.util.Locale;

public class Polygon implements Shape{
    private Vec2[] points;


    public Polygon(Vec2[] points) {
        this.points = points;
    }


    @Override
    public Vec2 getBound() {
        double x = 0, y = 0;
        for (int i = 0; i < points.length; i++) {
            x = Math.max(x, points[i].x);
            y = Math.max(y, points[i].y);
        }
        return new Vec2(x, y);
    }



    public String toSvg (String parameters){
        String result = "";
        for(int i=0; i<this.points.length; i++)
        {
            result += String.format(Locale.ENGLISH, "%f,%f " , points[i].x, points[i].y );
        }
        return String.format(Locale.ENGLISH,
                "<polygon points=\"%s\" %s/>", result,parameters);
    }
}