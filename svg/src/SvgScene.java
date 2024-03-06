import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SvgScene {
    private ArrayList<Polygon> shapes = new ArrayList<>();
    public void add(Polygon p){
        shapes.add(p);
    }
    public void save (String path){
        try {
            FileWriter fw=new FileWriter(path); //wykonuje dzialanie, przy ktorym moze powstac problem na wejsciu/wyjsciu
            fw.write(String.format("<html> <body> <svg width=\"%f\" height=\"%f\">", )); //ziomek speedrunuje zadanie nic nie wiem bruh
            for(Polygon polygon: shapes){
                fw.write(polygon.toSvg());
            }
            fw.write("</svg> </body> </html>");
            fw.close();
        } catch (IOException e) {
            System.err.println("cannot write to "+path); //serr to samo co cerr w cpp

        }
        public Point getBounds(){
            for(Point p:shapes.g)
        }
    }
}
