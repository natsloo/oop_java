import java.util.Locale;

public class Polygon {
    private Point[] points;
    private Style style;

    public Polygon(Point[] points) {
        this.points = points;
        this.style=new Style();
    }
    public Polygon(Point[] points, Style style){
        this.points=points;
        this.style=style;
    }
    public String toSvg(){
        String result = "";
        for(int i=0;i<this.points.length;i++)
        {
            result+=String.format(Locale.ENGLISH, "%f,%f " ,this.points[i].x,this.points[i].y);
        }
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"%s/>", result,style.toSvg());
    }
}

//<polygon points="200,10 250,190 150,190" style="fill:lime;stroke:purple;stroke-width:3" />