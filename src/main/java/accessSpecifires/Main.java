package accessSpecifires;

import accessSpecifires.animal.mammal.Mammal;
import accessSpecifires.animal.reptile.Reptile;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.setAge(10);
        System.out.println(mammal);

        Reptile reptile = new Reptile();
       // System.out.println(reptile.name); protected -> nie jest widoczny poza pakietem reptile
    }
}