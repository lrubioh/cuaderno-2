import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Circle;
import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Rectangle;
import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Shape;
import es.uah.matcomp.mp.e3.ejerciciosclases.e5.Square;


public class Main {
    public static void main(String[] args) {
        //PARTE DE SHAPE
        Shape shape1=new Shape();
        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println("El color es:"+shape1.getColor()+", is "+shape1.isFilled()+" it's filled");

        //PARTE DEL CIRCLE
        Circle circle1=new Circle();
        Circle circle2=new Circle(2,"purple",true);
        circle1.setRadius(5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        System.out.println(circle2.toString());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());

        //PARTE RECTANGLE
        Rectangle r1=new Rectangle();
        Rectangle r2= new Rectangle(5,3,"red",true);
        r1.setLength(16);
        r1.setWidth(7);
        System.out.println(r1.getLength()+","+r1.getWidth());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.toString());

        //PARTE DEL SQUARE
        Square s1=new Square();
        Square s2=new Square(2,"red",true);
        s1.setSide(5);
        System.out.println(s1.getSide());
        System.out.println(s2.toString());

    }
}

