import es.uah.matcomp.mp.e2.ejerciciosclases.e7.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e7.MyTriangle;

public class Main {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(2,7 );
        MyPoint v2 = new MyPoint(8,5 );
        MyPoint v3 = new MyPoint(3,1);

        MyTriangle t1 = new MyTriangle(v1,v2,v3);
        MyTriangle t2= new MyTriangle(0,0,4,0,2,3);
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t2.getType());
        MyTriangle t3= new MyTriangle(1,1,6,1,5,5);
        System.out.println(t3.toString());
        System.out.println(t3.getPerimeter());
        System.out.println(t3.getType());



    }
}

