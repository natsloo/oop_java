import java.util.Locale;

public class Style {
    public final String fillColor, strokeColor;
    public final Double strokeWidth;
    public Style(String f, String s, double w){
        fillColor=f;
        strokeColor=s;
        strokeWidth=w;
    }
    public Style(){
        this("transparent","black",1.0);
    }
    public String toSvg(){
        return String.format(Locale.ENGLISH,"fill:%s;stroke:%s;stroke-width:%f\"/>",fillColor,strokeColor,strokeWidth);
    }
}
