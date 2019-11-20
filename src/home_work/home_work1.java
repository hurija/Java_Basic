package home_work;

import java.util.Scanner;

public class home_work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String lastName;
        String jobPosition;
        double salary;
        String gender;
        String pesel;

        System.out.println("Imię: ");
        name = scanner.nextLine();
        System.out.println("Nazwisko: ");
        lastName = scanner.nextLine();
        System.out.println("Stanowisko: ");
        jobPosition = scanner.nextLine();
        System.out.println("Pensja: ");
        salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Płeć: ");
        gender = scanner.nextLine();
        System.out.println("PESEL: ");
        pesel = scanner.nextLine();

        System.out.printf(name + " " + lastName + " "+ jobPosition + " " + gender + " " + pesel);
        scanner.close();
    }
}
