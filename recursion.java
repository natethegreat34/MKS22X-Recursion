import java.util.*;
public class recursion{
    public static void main(String[] args) {
        System.out.println(sqrt(169, .0001));
        System.out.println(fib(4));
        System.out.println(makeAllSums(3));
    }
public static ArrayList<Integer> as = new ArrayList<Integer>();
public static int target = 0;
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
        if (n == 0){
            return as;
        }
        int [] nums = new int [n * n];
        int [] hold = makelist(n, nums, 0);
        if (helper(0, hold, target, 0)){
            as.add(target);
        }
        target ++;
        if (target < n * n){
        makeAllSums(n);
    }
    return as;
}
public static int [] makelist (int n, int [] nums, int start){
    // makes an int array of all numbers between the n and 0
    nums [start] = n;
    if (n > 0){
    makelist(n-1, nums, start + 1);
}
return nums;
}

public int helper(int start, int [] nums, int target, int current) {
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
