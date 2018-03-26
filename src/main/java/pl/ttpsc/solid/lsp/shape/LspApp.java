package pl.ttpsc.solid.lsp.shape;

import pl.ttpsc.solid.lsp.shape.model.Circle;
import pl.ttpsc.solid.lsp.shape.model.Rectangle;
import pl.ttpsc.solid.lsp.shape.model.Shape;
import pl.ttpsc.solid.lsp.shape.model.Square;

import java.util.ArrayList;
import java.util.List;

public class LspApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.5));
        shapes.add(new Rectangle(4, 3));
        shapes.add(new Square(5));

        shapes.forEach(shape -> {
            double perimeter = shape.calcPerimeter();
            double surface = shape.calcSurfaceArea();
            System.out.printf("%s:\nPerimeter: %f\nSurface: %f\n",
                    shape.getName().getDisplayName(), perimeter, surface);
        });
    }
}
