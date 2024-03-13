//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//
//public class SvgScene {
//    private ArrayList<Shape> shapes = new ArrayList<>();
//    public void add(Shape polygon){
//        shapes.add(polygon);
//    }
//    public Point getBounds(){
//        double x=0,y=0;
//        for(Point p:shapes.stream().map(Shape::getBound).collect(Collectors.toList())){
//            x=Math.max(x,p.x);
//            y=Math.max(y,p.y);
//        }
//        return new Point(x,y);
//    }
//
//    public void save (String path){
//        try {
//            FileWriter fw=new FileWriter(path); //wykonuje dzialanie, przy ktorym moze powstac problem na wejsciu/wyjsciu
//            Point bounds = getBounds();
//            fw.write("<HTML>");
//            fw.write("<body>");
//            fw.write(String.format("<svg width=\"%f\" height=\"%f\">\n",bounds.x,bounds.y)); //ziomek speedrunuje zadanie nic nie wiem bruh
//            for(Shape polygon: shapes){
//                fw.write("\t" + polygon.toSvg() + "\n");
//            }
//            fw.write("</svg>");
//            fw.write("</body>");
//            fw.write("</html>");
//            fw.close();
//        } catch (IOException e) {
//            System.err.println("cannot write to "+path); //serr to samo co cerr w cpp
//
//        }
//    }
//    }
//
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SvgScene {

    List<String>
    public static SvgScene instance;

    public Scene getInstance(){
        if(instance==null){
            instance = new SvgScene();
        }
        return instance;
    }
    private ArrayList<Shape> shapes = new ArrayList<>();
    public void add(Shape polygon)
    {
        shapes.add(polygon);
    }
    public Vec2 getBounds() {
        double x = 0, y = 0;
        for (Vec2 p : shapes
                .stream()
                .map(Shape::getBound).collect(Collectors.toList())) {
            x = Math.max(x, p.x);
            y = Math.max(y, p.y);
        }
        return new Vec2(x, y);
    }
    public void save(String path)
    {
        try {
            FileWriter fileWriter = new FileWriter(path);
            Vec2 bounds = getBounds();
            fileWriter.write("<HTML>");
            fileWriter.write("<body>");
            fileWriter.write(
                    String.format(
                            "<svg width=\"%f\" height=\"%f\">\n",
                            bounds.x,
                            bounds.y
                    )
            );
            for(Shape polygon : shapes)
                fileWriter.write("\t" + polygon.toSvg("") + "\n");
            fileWriter.write("</svg>");
            fileWriter.write("</body>");
            fileWriter.write("</HTML>");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("can't write to "+ path);
        }
    }

}