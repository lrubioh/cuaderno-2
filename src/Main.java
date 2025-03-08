import es.uah.matcomp.mp.e3.ejerciciosclases.e4.MovablePoint;
import es.uah.matcomp.mp.e3.ejerciciosclases.e4.Point;


public class Main {
    public static void main(String[] args) {
        Point punto=new Point(50,70);
        Point punto2=new Point();
        float[]coordenadaspunto= punto.getXY();
        System.out.println("("+coordenadaspunto[0]+ ","+ coordenadaspunto[1]+")");
        punto2.setX(16);
        System.out.println(punto.getX());
        punto2.setY(16);
        System.out.println(punto.getY());
        punto2.setXY(5,9);
        System.out.println(punto2.toString());

        //PARTE DEL MOVABLEPOINT
        MovablePoint movablePoint1=new MovablePoint();
        MovablePoint movablePoint2=new MovablePoint(1,2,5,16);
        MovablePoint movablePoint3=new MovablePoint(6,9);
        movablePoint3.setXSpeed(5);
        System.out.println(movablePoint3.getXSpeed());
        movablePoint3.setYSpeed(20);
        System.out.println(movablePoint3.getYSpeed());
        float[] coordenadas=movablePoint3.getSpeed();
        System.out.println(coordenadas[0]+","+coordenadas[1]);


    }
}

