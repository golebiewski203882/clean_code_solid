package pl.ttpsc.solid.lsp.shape.model;

public class Rectangle implements Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double calcSurfaceArea() {
        return sideA * sideB;
    }

    @Override
    public ShapeName getName() {
        return ShapeName.RECTANGLE;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
