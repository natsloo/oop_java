//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Point point;
        point=new Point(2.4, 5.5);
        System.out.println(point);
        Segment seg=new Segment(point,new Point(6.7,8.5));
        System.out.println(seg.length());
        System.out.println(seg.toSvg()); */
        Polygon poly = new Polygon(new Point[]{
                new Point(25, 43),
                new Point(60, 80),
                new Point(50, 40)
        });
        System.out.println(poly.toSvg());
    }
}