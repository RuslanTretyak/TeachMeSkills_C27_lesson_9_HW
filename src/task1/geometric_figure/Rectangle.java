package task1.geometric_figure;

public final class Rectangle extends GeometricFigure {
    public int Height;
    public int Width;

    public Rectangle(int height, int width) {
        super("Прямоугольник");
        Height = height;
        Width = width;
    }

    @Override
    public double calculateSquare() {
        return this.Height * this.Width;
    }

    @Override
    public double calculatePerimeter() {
        return (this.Width + this.Height) * 2;
    }
}
