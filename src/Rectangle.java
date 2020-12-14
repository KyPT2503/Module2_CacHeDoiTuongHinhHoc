public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle() {
        super();
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height,String color,boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    @Override
    public String toString(){
        return "A Rectangle with width="+this.width+" and length="+this.height+", which is a subclass of "+super.toString();
    }
}
