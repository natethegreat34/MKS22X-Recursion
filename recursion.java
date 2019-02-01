import java.util.*;
public class recursion{
    public static void main(String[] args) {
        System.out.println(sqrt(169, .0001));
        System.out.println(fib(4));
        System.out.println(makeAllSums(3));
    }
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
            return helper (n, g, tolerance);
        }
        public static double helper (double n, double g, double tolerance){
            if (   ((Math.abs((g * g) - n)) / n) * 100 > tolerance){
                double help = ((n/g) + g)/2.0;
              return helper (n, help, tolerance);
            }
            return g;
        }


    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
        if (n > 1){
            return fib(n - 2) + fib(n - 1);
        }
        if (n == 1){
            return 1;
        }
        return 0;
    }


    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
            ArrayList<Integer> as = new ArrayList<Integer>(2^n);
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
        // maybe I need a wrapper that takes n
        // if I do 3 + 2 + 1
        // and then do the same for 2
        // 2 + 1
        // it is like the 3 is not included so this should work
        if (n != 0){
        // only works for half
        // 1   2   3  tot
        // T   T   T   6
        // T   T   F   3
        // T   F   F   1
        // F   F   F   0
        //If done other way
        // F   T   T   5
        // F   F   T   3

        as.add(rap (n));
        System.out.println(as);
        makeAllSums(n - 1);
    }
    return as;
}
    public static int rap (int n){
        if (n != 0){
            System.out.println(n);
        return n + rap (n - 1);
    }
    else return 0;
}
}
