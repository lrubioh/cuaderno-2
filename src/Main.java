import es.uah.matcomp.mp.e3.ejerciciosclases.e3.Point2D;



public class Main {
    public static void main(String[] args) {
        Point2D point=new Point2D(53.3f,5);
        float[]coord= point.getXY();
        System.out.println("("+coord[0]+","+coord[1]+")");
    }
}

