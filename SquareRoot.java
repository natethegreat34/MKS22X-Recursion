import java.lang.Math;
public class SquareRoot{
public static void main(String[] args) {
    System.out.println(sqrt (169.0));
}
public static double sqrt(double n){
    double g = n/3;
    if (n == 0){
        return 0;
    }
    return helper (n, g);
}
public static double helper (double n, double g){
    if (   ((Math.abs((g * g) - n)) / n) * 100 > .00001){
        double help = ((n/g) + g)/2.0;
      return helper (n, help);
    }
    return g;
}
}
