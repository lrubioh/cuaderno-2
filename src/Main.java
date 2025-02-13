import es.uah.matcomp.mp.e2.ejerciciosclases.e5.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e5.Myline;
public class Main {
    public static void main(String[] args) {

        /// pruebo todos los metodos para ver que funcionen correctamente

        MyPoint p1 = new MyPoint(16, 5);
        MyPoint p2 = new MyPoint(1, 7);
        MyPoint p3 = new MyPoint(2, 8);
        Myline l1 = new Myline(1, 3, 2, 5);
        Myline l2 = new Myline(p1, p2);
        System.out.println(p1);
        System.out.println(l1); //imprimo mi linea : su inicio  final
        //imprimo la linea coordenada a coordenada del inicio y final
        System.out.println(l2.getBegin()); //imprimo el begin entero
        System.out.println(l2.getEnd());//imprimo el end entero
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());

        // pruebo los setters
        l1.setBeginX(p1.getX());
        System.out.println(l1);//lo imprimo solo cambiando la x
        l1.setBeginY(p1.getY());
        System.out.println(l1);//lo imprimo cambiandolo entero

        l1.setEndX(p1.getX());
        System.out.println(l1);
        l1.setEndY(p1.getY());
        System.out.println(l1);

        l1.setBegin(p2);
        System.out.println(l1);
        l2.setEnd(p3);
        System.out.println(l2);

        //pruebo los set y los get XY

        l1.setBeginXY(p3.getX(), p2.getY()); //set el x del p3 y el y del p2 como begin
        System.out.println(l1);//lo imprimo
        l1.getBeginXY();// saco solo en begin de l1
        l2.setEndXY(p1.getX(), p2.getY()); //set el x del p1 y el y del p2
        System.out.println(l2);//imprimo l2
        l2.getEndXY();//saco el end de l2 para comprobar que el set se haya hecho bien

        //pruebo el get length

        System.out.println(l2.getLength());
        System.out.println(l1.getLength());
    }
}


