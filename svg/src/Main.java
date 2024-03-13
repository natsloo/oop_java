////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        /*Point point;
//        point=new Point(2.4, 5.5);
//        System.out.println(point);
//        Segment seg=new Segment(point,new Point(6.7,8.5));
//        System.out.println(seg.length());
//        System.out.println(seg.toSvg()); */
//        Style style=new Style("pink","black",3.0);
//        Polygon poly = new Polygon(new Point[]{
//                new Point(25, 43),
//                new Point(60, 80),
//                new Point(50, 40)
//        },style);
//
//        System.out.println(poly.toSvg());
//        Style s=new Style("pink","black",3.0);
//        Polygon p = new Polygon(new Point[]{
//                new Point(24, 53),
//                new Point(12, 32),
//                new Point(10, 80)
//        },s);
//
//        System.out.println(p.toSvg());
//        SvgScene scene=new SvgScene();
//        scene.add(poly);
//        scene.add(p);
//        Ellipse e = new Ellipse(style, new Point(100,200),50.5,75.7);
//        scene.add(e);
//        scene.save("C:\\Users\\natal\\Desktop\\studia\\I ROK\\II semestr\\programowanie obiektowe\\oop_java\\svg\\out.html"); //chyba nie dziala?
//    }
//
//}

public class Main {
    public static void main(String[] args) {
        /*SolidFilledPolygon poly = new SolidFilledPolygon(new Vec2[]{
                new Vec2(30, 70),
                new Vec2(60, 80),
                new Vec2(50, 40)
        },"green");
//        Polygon polygon = new Polygon(new Vec2[]{
//                new Vec2(500, 100),
//                new Vec2(220, 20),
//                new Vec2(400, 25),
//                new Vec2(70, 33),
//        });
//        System.out.println(polygon.toSvg());
//        System.out.println(poly.toSvg());
        Scene scene = new Scene();
//        Ellipse ellipse = new Ellipse(new Vec2(100, 200), 50.5, 75.7);
        scene.add(poly);
//        scene.add(poly);
//        scene.add(ellipse);

        scene.save("/tmp/out.html");

         */
        Shape polygon = new Polygon(new Vec2[]{
                new Vec2(500, 100),
                new Vec2(220, 20),
                new Vec2(400, 25),
                new Vec2(70, 33),
        });
        polygon = new SolidFillShapeDecorator(polygon, "red");

        Shape ellipse = new Ellipse(new Vec2(100, 200), 50.5, 75.7);
        ellipse = new SolidFillShapeDecorator(ellipse,"blue");

        SvgScene scene = new SvgScene();
        scene.add(polygon);
        scene.add(ellipse);

        scene.save("/tmp/out.html");

    }
}