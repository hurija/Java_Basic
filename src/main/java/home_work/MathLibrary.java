package exercises;

public class MathLibrary {

    // 1. Zaimplementuj metodę zwracającą średnią wartości
    // typu double podanych w argumencie metody jak tablica

    public static double avg(double[] args) {
        double sum = 0;
        for (double a : args) {
            sum += a;
        }
        return sum / args.length;

    }

    // 2. Zaimplementuj metodę  potengującą dwie liczby całkowite
// Metoda zwraca wynik dziłania a przyjmuje jako argumenty kolejno
// podstawę i wykładnik
//
    public static long power(long x, long y) {
        long power = 1;
        for (int i = 0; i < y; i++) {
            power *= x;
        }
        return power;
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = n; i >1; i--) {
            factorial *= i;
        }
        return factorial;

    }

    // rekurencja
    public  static long factorialR(int n) {
        if (n > 1) {
            return n* factorialR(n - 1);
        }
        return 1;

        // lub return (n >1) ? n * factorialR(n: n - 1) :1;

    }
    // suma n= elementów w ciągu fibonacciego
    // 01 1 2 3 5 8 ...
    public int fiboSum(int n) {
        if(n == 0 || n ==1) {
            return  0;
        }
        int [] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        int fiboSum = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
            fiboSum += fibo [i];

        }
        return fiboSum;

    }
}
