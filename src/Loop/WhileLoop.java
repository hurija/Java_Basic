package Loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // znajdujemy się w pętli nieskończonej dopóki nie zostanie przerwana
        //CLI ->Command Line Interface
        boolean isFinished = false;
        while(isFinished != true) {
        System.out.println("Witaj w naszej aplikacji");
        System.out.println("(L) - logowanie");
        System.out.println("(R) - rejestracja");
        System.out.println("(Q) - wyjście");

        char decision = scanner.nextLine().toUpperCase().charAt(0);

        switch (decision) {
//            case 'l':
            case 'L':
                System.out.println("logowanie");
                break;
//            case 'r':
            case 'R':
                System.out.println("rejstracja");
                break;
//            case 'q':
            // przerwanie pętli
            case 'Q':
                System.out.println("wyjście");
                isFinished = true;
                break;
            default:
                System.out.println("zły wybór");
                break;
        }
        }
    }
}
