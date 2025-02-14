import es.uah.matcomp.mp.e2.ejerciciosclases.e6.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e6.MyCircle;
public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0,1 );
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle( 1,2,5);
        MyCircle c3 = new MyCircle(p1,5);

        //IMPRIMO LA INFO DE LOS DOS CIRCULOS CON EL STRING
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        //PRUBO LAS FUNCIONES SET Y GET
        c1.setRadius(2);
        System.out.println(c1.getRadius());
        //cambio el center en x y en y de c2
        c2.setCenterX(1);
        c2.setCenterY(5);
        System.out.println(c2.getCenter());



        //AREA
        System.out.println(c1.getArea());

        //Circumference
        System.out.println(c2.getCircumference());

        //DISTANCE
        System.out.println(c1.distance(c2));



    }
}

