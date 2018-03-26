package pl.ttpsc.solid.lsp.shape.model;

public enum ShapeName {
    CIRCLE("Circle"),
    SQUARE("Square"),
    RECTANGLE("Rectangle");

    private String displayName;

    ShapeName(String dispalyName) {
        this.displayName = dispalyName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
