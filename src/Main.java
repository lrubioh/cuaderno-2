import es.uah.matcomp.mp.e3.ejerciciosclases.e1.Cylinder;
import es.uah.matcomp.mp.e3.ejerciciosclases.e2.Person;
import es.uah.matcomp.mp.e3.ejerciciosclases.e2.Staff;
import es.uah.matcomp.mp.e3.ejerciciosclases.e2.Student;


public class Main {
    public static void main(String[] args) {
        //PARTE DE PERSON
        Person persona1= new Person("Laura", "laura.rubio.hernan@gmail.com");
        Person persona2= new Person("Adrian", "adrian.cano@gmail.com");
        System.out.println(persona1.toString());
        persona2.setAddress(persona1.getAddress());
        System.out.println(persona2.toString());

        //PARTE DE STUDENT
        Student student1 = new Student("John", "john.cano@gmail.com");
        Student student2 = new Student("Jane", "jane.cano@gmail.com", "science",2025,1000);
        System.out.println(student1.toString());
        student2.setProgram("letras");
        System.out.println(student2.getProgram());
        student2.setYear(2020);
        System.out.println(student2.getYear());
        student2.setFee(16);
        System.out.println(student2.getFee());

        //PARTE DEL STAFF
        Staff staff1 = new Staff("John", "john.cano@gmail.com","ellacuria",50);
        Staff staff2 = new Staff("Jane", "jane.cano@gmail.com","quimica",70);
        System.out.println(staff1.toString());
        staff1.setSchool(staff2.getSchool());
        System.out.println(staff1.getSchool());
        staff2.setPay(273);
        System.out.println(staff1.getPay());
        System.out.println(staff2.toString());
     }
}

