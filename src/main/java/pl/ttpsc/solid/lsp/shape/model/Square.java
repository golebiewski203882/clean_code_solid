package pl.ttpsc.solid.lsp.shape.model;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }

    @Override
    public double calcSurfaceArea() {
        return side * side;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.SQUARE;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
