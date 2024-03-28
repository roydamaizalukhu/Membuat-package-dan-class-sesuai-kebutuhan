public class Geometri {
    double getSurfaceArea();

    double getVolume();
}

public abstract class SolidShape implements Geometry {
    protected double surfaceArea;
    protected double volume;

    public SolidShape(double surfaceArea, double volume) {
        this.surfaceArea = surfaceArea;
        this.volume = volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public abstract double getBaseArea();

    public abstract double getHeight();
}

public class Cube extends SolidShape {
    public Cube(double sideLength) {
        super(6 * sideLength * sideLength, sideLength * sideLength * sideLength);
    }

    public double getBaseArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    public double getHeight() {
        return sideLength;
    }
}

public class RectangularPrism extends SolidShape {
    private double baseArea;
    private double height;

    public RectangularPrism(double baseArea, double height) {
        super(baseArea * 2 + height * 2, baseArea * height);
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public double getHeight() {
        return height;
    }
}

public class Sphere extends SolidShape {
    private double radius;

    public Sphere(double radius) {
        super(4 * Math.PI * Math.pow(radius, 2), (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
        this.radius = radius;
    }

    public double getBaseArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getHeight() {
        return radius;
    }
}

public class Cylinder extends SolidShape {
    private double baseArea;
    private double height;

    public Cylinder(double baseArea, double height) {
        super(baseArea * 2 + 2 * Math.PI * radius * height, baseArea * height);
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public double getHeight() {
        return height;
    }
}