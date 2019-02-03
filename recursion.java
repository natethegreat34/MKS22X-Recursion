import java.util.*;
public class recursion{
    public static void main(String[] args) {
        System.out.println(sqrt(169, .0001));
        System.out.println(fib(4));
        System.out.println(makeAllSums(3));
    }
public static ArrayList<Integer> as = new ArrayList<Integer>();
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
        int [] nums = new int [n * n]
        makelist(n, nums, 0);
        if (n == 0){
            return 0;
        }

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


    return as;
}}
public static int [] makelist (int n, int [] nums, int start){
    nums [start] = n;
    if (n > 0){
    makelist(n-1, nums, start + 1);
}

public boolean helper(int start, int [] nums, int target, int current) {
  if (current == target){
    return true;
  }
  if (start == nums.length){
    return false;
  }
  int oldstart = start;
  start ++;
  return helper(start, nums, target, current + nums[oldstart]) || helper(start, nums, target, current);
}
}
