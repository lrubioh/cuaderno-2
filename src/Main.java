import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
public class Main {
    public static void main(String[] args) {

        /// pruebo todos los metodos para ver que funcionen correctamente

        MyPoint p1 = new MyPoint(); //p1 =(0,0) por el MyPoint()
        System.out.println(p1); //imprimo p1 con el String to String
        //con los setters cambio las coord de p1 por las nuevas que estoy estableciendo
        p1.setX(8);
        p1.setY(6);
        // lo imprimo usando la funcion getX y getY para probarlas tambien, la otra
        //opcion es el string to string pero ese ya le he usado con lo que lo pruebo
        //a traves de estos
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        //pruebo la funcion de setXY para establecer las coordenadas en una sola funcion
        //y no en dos como he hecho arriba
        p1.setXY(3, 0);
        //pruebo la funcion getXY int[]
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        //creo un nuevo punto y lo imprimo por pantalla
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        /// PRUEBO LOS METODOS DE LAS DISTANCIAS
        System.out.println(p1.distance(p2)); // which version? ANOTHER
        System.out.println(p2.distance(p1)); // which version? ANOTHER
        System.out.println(p1.distance(5, 6)); // which version? INT X, INT Y
        System.out.println(p1.distance()); // which version? DISTANCIA CON EL 0

        // Creación y visualización de 10 puntos
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Matriz de distancias
        System.out.println("Matriz de distancias:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                System.out.printf("%.2f ", points[i].distance(points[j]));
            }
            System.out.println();
        }

    }

}


