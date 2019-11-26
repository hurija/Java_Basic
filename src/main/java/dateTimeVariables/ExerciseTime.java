package dateTimeVariables;



import java.time.LocalDate;

public class ExerciseTime {
    public static void main(String[] args) {



        //    znajdź dzień tygodnia w którym się urodziłaś
        LocalDate birthDate = LocalDate.of(1990, 02, 07);
        int myDayOfTheWeek = birthDate.getDayOfWeek().getValue();
        System.out.println(myDayOfTheWeek);


        LocalDate actual = LocalDate.now();
        int counter = 0;
        for (birthDate.getYear(); birthDate.getYear() <= actual.getYear(); birthDate = birthDate.plusYears(1)) {
            if (myDayOfTheWeek == birthDate.getDayOfWeek().getValue()) {
                System.out.println(birthDate);
                counter++;
            }
        }

    }
}
