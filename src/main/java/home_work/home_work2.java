package home_work;


import java.util.Scanner;

import static java.lang.String.*;

public class home_work2 {
    public static void main(String[] args) {
        String date;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Wpowadź rok, miesiąc i dzień urodzin w formacie YYYY-MM-DD: ");
            date = scanner.nextLine();


            String year = date.substring(0, 4);
            Integer valueOfYear;
            valueOfYear = Integer.valueOf(year);

            String month = date.substring(6, 7);
            Integer valueOfMonth;
            valueOfMonth = Integer.valueOf(month);

            String day = date.substring(9, 10);
            Integer valueOfDay;
            valueOfDay = Integer.valueOf(day);

            System.out.println(valueOfYear);
            System.out.println(valueOfMonth);
            System.out.println(valueOfDay);

            int localYear = 2019;

            System.out.println("Twój wiek to: ");
            int age;
            age = localYear - valueOfYear;
            System.out.println(age);

            scanner.close();



        }
    }
}
