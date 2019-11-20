package Tables;

public class MultiArrey {
    public static void main(String[] args) {

        char [] [] t = {
                {'_', 'x', '_'},
                {'_', 'o', '_'},
                {'_', 'x', 'o'}
        };
        // pętla iterująca po wierszach
        for (int i = 0; i < t.length ; i++) {
            //pętla iterująca pokolumnach
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println();

        }

        //tablice wielowymiarowe nieregularne
        int [] []  numbers =  {
                {1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3, 3}
        };
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j< numbers [i].length; j++) {
                System.out.printf("%3d", numbers[i] [j]);
            }
            System.out.println();
        }
        
        // 1. i = 0 | 0 < 3 -> true | i++
        // -> j = 0 | 0 < 3 -> true | j++ 1
        // -> j = 1 | 1 < 3 -> true | j++ 1 1
        // -> j = 2 | 2 < 3 -> true | j++ 1 1 1
        // -> j = 3 | 3 < 3 -> false | j++ 1 1 1 \n
                                           
        // 2. i = 1 | 1 < 3 -> true | i++
        // -> j = 0 | 0 < 5 -> true | j++  1 1 1
        //                                 2 ...
        

    }
}
