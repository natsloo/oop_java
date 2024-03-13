public class TransformationDecorator extends ShapeDecorator{
    String transform;
    public static class Builder{
        public Builder(){
            this.tranform="";
        }
        public Builder translate(Vec2 translation){
            this.transform +=
        }
    }
    public TransformationDecorator(Shape shape){
        super(shape);
        this.transform=transform;
    }
}
