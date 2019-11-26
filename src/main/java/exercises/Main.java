package exercises;

import exercises.controller.AutoController;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AutoController ac = new AutoController();

        System.out.println("Dodano: " + ac.addAuto("VW", "Passat", Engine.v2_0, Fuel.diesel, 120000));
        System.out.println("Dodano: " + ac.addAuto("VW", "Golf", Engine.v2_0, Fuel.diesel, 1250000));
        System.out.println("Dodano: " + ac.addAuto("VW", "Tiguan", Engine.v3_0, Fuel.hybrid, 1220000));
        ac.printAllAutos();

        System.out.println("Usunięto: " + ac.deleteAutoById(2));
        ac.printAllAutos();

        System.out.println("Rabat " + ac.discuntAutoById(1, 10));

        ac.changeAllAutosPrice(false, 5);
        ac.printAllAutos();

        Scanner scanner = new Scanner(System.in);
        int decision = ' ';
        while (decision != 'Q') {
            System.out.println("Panel Fabryki Aut");
            System.out.println("(Z) - zamów auto");
            System.out.println("(P) - pokaż listę zamówionych aut");
            System.out.println("(U) - usuń auto");
            System.out.println("(R) - daj rabat na auto");
            System.out.println("(C) - zmień cenę wszystkich aut");
            System.out.println("(Q) - wyjście");
            decision = scanner.nextLine().toUpperCase().charAt(0);
            switch (decision) {
                case 'Z':
                    System.out.println("Podaj markę: ");
                    String brand = scanner.nextLine();
                    System.out.println("Podaj model: ");
                    String model = scanner.nextLine();
                    System.out.println("Wybierz rodzaj silnika, wciśnij:");
                    System.out.println("(A) dla v1_5");
                    System.out.println("(B) dla v1_9");
                    System.out.println("(C) dla v2_0");
                    System.out.println("(D) dla v3_0");
                    Engine engine = Engine.v1_5;
                    int decision1 = ' ';
                        decision1 = scanner.nextLine().toUpperCase().charAt(0);
                        switch (decision1) {
                            case 'A':
                                engine = Engine.v1_5;
                                break;
                            case 'B':
                                engine = Engine.v1_9;
                                break;
                            case 'C':
                                engine = Engine.v2_0;
                                break;
                            case 'D':
                                engine = Engine.v3_0;
                                break;
                    }
                    Fuel fuel = Fuel.diesel;
                    System.out.println("Wybierz rodzaj paliwa, wciśnij:");
                    System.out.println("(A) dla Diesel");
                    System.out.println("(B) dla Benzine");
                    System.out.println("(C) dla Hybrid");
                    int decision2 = ' ';
                    decision2 = scanner.nextLine().toUpperCase().charAt(0);
                    switch (decision2) {
                        case 'A':
                            fuel = Fuel.diesel;
                            break;
                        case 'B':
                            fuel = Fuel.gasoline;
                            break;
                        case 'C':
                            fuel = Fuel.hybrid;
                            break;
                    }

                    System.out.println("Cena: ");
                    double price = scanner.nextDouble();
                    System.out.println("Dodano: " + ac.addAuto(brand, model, engine, fuel, price));
                    break;
                case 'P':
                    ac.printAllAutos();
                    break;
                case 'U':
                    System.out.println("ID auta, które chcesz usunąć");
                    ac.printAllAutos();
                    int id;
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Usunięto: " + ac.deleteAutoById(id));
                    break;
                case 'R':
                    System.out.println("Podaj ID auta:");
                    ac.printAllAutos();
                    int idAuto = scanner.nextInt();
                    System.out.println("Podaj ilość rabatu");
                    int percent = scanner.nextInt();
                    System.out.printf("Nowa cena:", ac.discuntAutoById(idAuto, percent));
                    scanner.nextLine();
                    break;
                case 'C':
                    System.out.println("(+) -podnieś cenę");
                    System.out.println("( ) -obniż cenę");
                    boolean isDiscount = scanner.nextLine().isEmpty();
                    System.out.println(" Wprowadź %: ");
                    ac.changeAllAutosPrice(isDiscount, scanner.nextInt());
                    ac.printAllAutos();
                    scanner.nextLine();
                    break;
                case 'Q':
                    System.out.println("Do zobaczenia!");
                default:
                    System.out.println("Błędny wybór");
            }
        }
    }
}


