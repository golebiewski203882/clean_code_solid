package pl.ttpsc.solid.lsp.shape.model;

public interface Shape {
    double calcPerimeter();

    double calcSurfaceArea();

    ShapeName getName();
}
