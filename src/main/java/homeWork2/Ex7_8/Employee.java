package homeWork2.Ex7_8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data // getters & setters & toString{}
@AllArgsConstructor // konstruktor z wszystkimi parametrami

public class Employee {
    private String name, lastName;
    private final String PESEL;
    private LocalDate empDate;
    private LocalDate birthDate;
    private double salaryNet;

}
