public class Segitiga {
    protected double base;
    protected double height;
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    public boolean isScalene() {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }
}

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double sideLength) {
        super(sideLength, sideLength, sideLength);
    }

    public String toString() {
        return "Equilateral Triangle with side length " + getSide1();
    }
}

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double height, double sideLength) {
        super(base, height, sideLength, sideLength, sideLength);
    }

    public String toString() {
        return "Isosceles Triangle with base " + getBase() + ", height " + getHeight() + ", and side length "
                + getSide1();
    }
}

public class ScaleneTriangle extends Triangle {
    public ScaleneTriangle(double base, double height, double side1, double side2, double side3) {
        super(base, height, side1, side2, side3);
    }

    public String toString() {
        return "Scalene Triangle with base " + getBase() + ", height " + getHeight() + ", side 1 " + getSide1()
                + ", side 2 " + getSide2() + ", and side 3 " + getSide3();
    }
}