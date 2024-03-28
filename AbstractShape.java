public interface Shape {
    double getArea();

    double getPerimeter();
}

public abstract class AbstractShape implements Shape {
    protected double area;
    protected double perimeter;

    public AbstractShape() {
        this.area = 0;
        this.perimeter = 0;
    }

    public AbstractShape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

public class Rectangle extends AbstractShape implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(length * width, 2 * (length + width));
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }
}

public class Square extends AbstractShape implements Shape {
    private double side;

    public Square(double side) {
        super(side * side, 4 * side);
        this.side = side;
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }
}

public class Circle extends AbstractShape implements Shape {
    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius, 2 * Math.PI * radius);
        this.radius = radius;
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }
}