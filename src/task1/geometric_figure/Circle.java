package task1.geometric_figure;

public final class Circle extends GeometricFigure {
    public int Radius;

    public Circle(int radius) {
        super("Круг");
        Radius = radius;
    }

    @Override
    public double calculateSquare() {
        return this.Radius * 2 * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return this.Radius * this.Radius * Math.PI;
    }
}
