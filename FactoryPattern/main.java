public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape square = shapeFactory.getShape("SQUARE");
        circle.draw();
        square.draw();
    }
}
