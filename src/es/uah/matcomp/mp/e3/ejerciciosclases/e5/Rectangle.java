package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super();
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Rectangle["+ super.toString()+"," + width + ", length=" + length + "]";
    }
}
