public class recursion{
  /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      double guess = 1;
      while (Math.abs(n - Math.pow(guess, 2)) > tolerance * n){
        guess = (n / guess + guess) / 2;
      }
      return guess;
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
    // public static ArrayList<Integer> makeAllSums(int n){
    //
    // }
    public static void main(String[] args) {
      System.out.println(sqrt(100, .0001));
      System.out.println();
      System.out.println(sqrt(100321, .001));
      System.out.println(Math.sqrt(100321));
      System.out.println();
      System.out.println(fib(5));
      System.out.println(fib(10));
      System.out.println();
    }
}
