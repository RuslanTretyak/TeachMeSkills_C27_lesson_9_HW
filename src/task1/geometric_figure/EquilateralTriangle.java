package task1.geometric_figure;

public final class EquilateralTriangle extends GeometricFigure {
    public int sideLength;

    public EquilateralTriangle(int sideLength) {
        super("Равносторонний треугольник");
        this.sideLength = sideLength;
    }

    @Override
    public double calculateSquare() {
        return this.sideLength * this.sideLength * Math.sqrt(3) / 4;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideLength * 3;
    }
}
