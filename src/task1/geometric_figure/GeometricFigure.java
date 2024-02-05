package task1.geometric_figure;

public abstract sealed class GeometricFigure permits Circle, EquilateralTriangle, Rectangle {
    public String figureName;

    public GeometricFigure(String figureName) {
        this.figureName = figureName;
    }

    public abstract double calculateSquare();
    public abstract double calculatePerimeter();
}
