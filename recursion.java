public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
        double g = n/3;
        if (n == 0){
            return 0;
        }
        if (   ((Math.abs((g * g) - n)) / n) * 100 > .00001){
            double help = ((n/g) + g)/2.0;
          return sqrt (n, help);
        }
        return g;
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
        if (n > 1){
            return fibonacci(n - 2) + fibonacci (n - 1);
        }
        if (n == 1){
            return 1;
        }
        return 0;
    }


    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
        // 1   2  tot
        // T   T  3
        // T   F  1
        // F   T  2
        // F   F  0
        //vvvvvvvvvv number of possiblilites is 2^n
        // 1   2   3  tot
        // T   T   T   6
        // T   F   F   1
        // F   T   F   2
        // F   F   T   3
        // T   T   F   3
        // F   T   T   5
        // T   F   T   4
        // F   F   F   0
    }

}
