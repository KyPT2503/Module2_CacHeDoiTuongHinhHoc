public class Circle extends Shape {

    private double radius;

    Circle() {
        super();
        this.radius = 1;
    }

    public Circle(double radius,String color,boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.radius + ", which is a subclass of" + super.toString();
    }
}
