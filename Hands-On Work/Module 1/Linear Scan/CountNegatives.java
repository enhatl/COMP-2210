/**
 * Applies the linear scan strategy to counting the number of negative
 * values in an array.
 * @author Emily Hollingshead - COMP 2210
 */
public class CountNegatives {

   /**
    * Returns the number of negative values in the given array.
    * @param a - name of integer array
  
    * @return neg - total number of negative numbers
    */
   public static int countNegatives(int[] a) {
      int negativeCount = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] < 0) {
            negativeCount = negativeCount + 1;
         }
      }
      return negativeCount;
      
   }
}
