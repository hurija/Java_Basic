package homeWork2.Ex7_8;


        import homeWork2.ex7_8.Company;

        import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        homeWork2.ex7_8.Company c = new Company();
        System.out.println("Info: " + c.addEmployee("Adam","Kowalski","12312312312", LocalDate.of(2000,4,3), 10000));
        System.out.println("Info: " + c.addEmployee("Michał","Kowalski","12312312362", LocalDate.of(2000,4,3), 10000));
        System.out.println("Info: " + c.addEmployee("Adam","Kowalski","12318312312", LocalDate.of(2000,4,3), 10000));

        c.getEmployees();

        c.setSalaryByPESEL(15000, "12312312362");

        c.getEmployees();




    }
}