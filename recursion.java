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

}
