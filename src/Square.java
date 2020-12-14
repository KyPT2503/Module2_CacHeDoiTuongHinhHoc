public class Square extends Rectangle {
    public double side;

    Square() {
        this.side = 1;
    }

    Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side);
        this.side = side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width){
        this.setSide(width);
    }
    @Override
    public void setHeight(double height){
        this.setSide(height);
    }
    @Override
    public String toString(){
        return "A Square with side="+this.side+", which is a subclass of "+super.toString();
    }
}
