package task1;

import task1.geometric_figure.Circle;
import task1.geometric_figure.EquilateralTriangle;
import task1.geometric_figure.GeometricFigure;
import task1.geometric_figure.Rectangle;

public class Runner {
    public static void main(String[] args) {
        GeometricFigure[] geometricFigure = {
                new Circle(10),
                new Rectangle(10, 20),
                new EquilateralTriangle(5),
                new Rectangle(6, 2),
                new Circle(5)
        };
        double sumPerimeter = 0;
        for (GeometricFigure figure : geometricFigure) {
            System.out.println(figure.figureName);
            System.out.println("площадь: " + figure.calculateSquare());
            System.out.println("периметр: " + figure.calculatePerimeter() + "\n");
            sumPerimeter += figure.calculatePerimeter();
        }
        System.out.println("сумма периметров всех фигур в массиве: " + sumPerimeter);
    }
}
