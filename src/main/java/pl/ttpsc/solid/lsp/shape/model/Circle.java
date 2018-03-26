package pl.ttpsc.solid.lsp.shape.model;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcSurfaceArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.CIRCLE;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
