public interface Shape {
    //final protected Style style; //protected daje dostep ze wszystkich dziedziczacych klas

    //public Shape(Style style) {
        //this.style = style;
    //}
//    public Shape(){
//        this.style=new Style();
//    }
    Vec2 getBound();
    String toSvg(String param);
}
