package oop;
// Klasa główna - uruchomieniowa

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu
        User userOne = new User();
        // odwołanie do pola kalsowego
        userOne.name = "Paulina";
        userOne.lastName = "Ciesielska";
        userOne.activated = true;
        userOne.gender = 'K';
        userOne.salary_net= 10100;
        // wywołanie metody
        userOne.printUser();
        User userTwo = new User ("Adam", "Kowalski", 'M', false, 10100);
        userTwo.printUser();
        User userThree = new User("Ewa", "Nowak", 'K', true, 15000);
        userThree.printUser();
        System.out.println();
        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross = " + salaryGross);
        System.out.println("Calculated salary gross: " + userTwo.calculateSalaryGross());
        System.out.println(userThree.modifyUserParameters(12000, true));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpowadź imię: ");
        String name = scanner.nextLine();
        System.out.println("Wpowadź nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Wpowadź płeć: ");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Wpowadź pensję netto: ");
        double salary_net = scanner.nextDouble();
        User userFour = new User(name, lastName, gender, true, salary_net);
        userFour.printUser();

    }
}
