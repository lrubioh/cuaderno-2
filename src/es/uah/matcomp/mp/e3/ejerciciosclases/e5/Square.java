package es.uah.matcomp.mp.e3.ejerciciosclases.e5;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getSide();
    }
    public void setSide(double side){
        setSide(side);
    }
    public void setWidth(double side){
        setWidth(side);
    }
    public void setLenght(double side){
        setLenght(side);
    }
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
