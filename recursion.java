import java.util.ArrayList;
public class recursion{
  /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return s(n, 1, tolerance);
    }
    public static double s(double n, double guess, double tolerance){
      if (Math.abs(n - Math.pow(guess, 2)) > tolerance * n){
        return s(n, (n / guess + guess) / 2, tolerance);
      }
      else return guess;
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if (n <= 1) return n;
      else return fib(n - 2) + fib(n - 1);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sums = new ArrayList<Integer>();
      return mas(n, 0, sums);
    }
    public static ArrayList<Integer> mas(int n, int sum, ArrayList<Integer> sums){
      if (n == 0) {
        sums.add(sum);
      }
      if (n > 0) {
        n--;
        mas(n, sum + n + 1, sums);
        mas(n, sum, sums);
      }
      return sums;
    }

    public static void main(String[] args) {
      System.out.println(sqrt(100, .0001));
      System.out.println();
      System.out.println(sqrt(100321, .001));
      System.out.println(Math.sqrt(100321));
      System.out.println();
      System.out.println(fib(5));
      System.out.println(fib(10));
      System.out.println();
      System.out.println(makeAllSums(3));
    }
}
