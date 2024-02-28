public class Point {
    public final double x;
    public final double y;

    @java.lang.Override
    public java.lang.String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
}
