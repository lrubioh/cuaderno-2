package es.uah.matcomp.mp.e2.ejerciciosclases.e3;
/// defino la clase y todas sus "propiedades"-> atrivutos
public class Customer {
    private int id;
    private String name;
    private char gender;
    /// EMPIEZO A DEFIINIR LOS METODOS
    /// DEFINO LAS COSAS QUE SE DE MI CUSTOMER
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    /// IMPLEMENTO LOS GETTERS QUE SON FUNCIONES DE LAS QUE OBTENGO CADA UNO DE LOS ATRIVUTOS DE MI CLASE (CUSTOMER)
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    /// Es la funcion que va a imprimir por pantalla en este caso el id del customer
    public String toString() {
        return name + "("+ id +")";
    }


}
