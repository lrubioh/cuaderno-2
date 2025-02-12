import es.uah.matcomp.mp.e2.ejerciciosclases.e3.Account;
import es.uah.matcomp.mp.e2.ejerciciosclases.e3.Customer;
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(99, "Laura", 'f');
        Customer c2 = new Customer(100, "Maria", 'f');
        System.out.println(c1); ///customers tostring()
        System.out.println(c2);

        /// no hay set con lo que no puedo probar a establecer un nuevo
        ///id o un nuevo nombre para un customer ya definido si se pudiese lo
        /// implementaria de la forma :
        /// c1.setId(valor del id nuevo)

        /// ya que si hay getters pruebo que funcionen bien estos lo que hacen
        /// es devolverme los valores que ya tengo estabecidos en la persona

        System.out.println("id is:" + c1.getId());
        System.out.println("name is:" + c1.getName());
        System.out.println("Gender is:" + c1.getGender());


        System.out.println("id is:" + c2.getId());
        System.out.println("name is:" + c2.getName());
        System.out.println("Gender is:" + c2.getGender());

        /// Pruebo la parte del codigo de account

        /// establezco dos cuentas de dos personas
        Account a1 = new Account(99, c1);
        Account a2 = new Account(100, c2);
        System.out.println(a1);
        System.out.println(a2);

        /// Introduzco un balance a cada una de las cuentas
        a1.setBalance(100);
        System.out.println(a1);
        a2.setBalance(200);
        System.out.println(a2);

        /// Imprimo el balance que he establecido arriba
        System.out.println("balance is:" + a1.getBalance());
        System.out.println("balance is:" + a2.getBalance());

        ///deposit

        a1.deposit(100);
        a2.deposit(200);
        System.out.println(a1);
        System.out.println(a2);

        ///withdraw
        /// cuenta 1 tiene 200 y pago 100
        a1.withdraw(100);
        System.out.println("balance is:"+ a1.getBalance());
        /// cuenta 2 tiene 400 y pago 300
        a2.withdraw(300);
        System.out.println("balance is:"+ a2.getBalance());
        /// cuenta 1 tiene 100 y pago 50
        a1.withdraw(50);
        System.out.println("balance is:" + a1.getBalance());
        /// busco el error
        a1.withdraw(70);
        System.out.println("balance is:" + a1.getBalance());







    }

}


