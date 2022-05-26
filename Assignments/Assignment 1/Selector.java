import java.util.Arrays;

/**
* Defines a library of selection methods
* on arrays of ints.
*
* @author   Emily Hollingshead (enh0019@auburn.edu)
* @author   Dean Hendrix (dh@auburn.edu)
* @version  05/26/2022
*
*/

public final class Selector {

   /**
    * Can't instantiate this class.
    *
    * D O   N O T   C H A N G E   T H I S   C O N S T R U C T O R
    *
    */
    
   private Selector() { }


   /**
    * Selects the minimum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    * @param a - array input
    * @return minimum of a
    * @throws IllegalArgumentException - evaluation not possible.
    */
    
   public static int min(int[] a) {
      int minimum = Integer.MAX_VALUE;
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         for (int i = 0; i < a.length; i++) {
            if (a[i] < minimum) {
               minimum = a[i];
            }
         }
      }
      return minimum;
   }


   /**
    * Selects the maximum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    * @param a - array input
    * @return maximum of a
    * @throws IllegalArgumentException - evaluation not possible.
    */
    
   public static int max(int[] a) {
      int maximum = Integer.MIN_VALUE;
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         for (int i = 0; i < a.length; i++) {
            if (a[i] > maximum) {
               maximum = a[i];
            }
         }
      }
      return maximum;
   }


   /**
    * Selects the kth minimum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth minimum value. Note that there is no kth
    * minimum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    * @param a - input array
    * @param k - kth minimum to find
    * @return kth minimum
    * @throws IllegalArgumentException - evaluation not possible.
    */
    
   public static int kmin(int[] a, int k) {
      int kMin = Integer.MAX_VALUE;
      //is a non-empty?
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      //create a copy to work with
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      //check for and remove duplicates
      int[] c = new int[b.length];
      c[0] = b[0];
      int j = 1; //position for array c
      for (int i = 1; i < b.length; i++) {
         if (b[i] != b[i - 1]) {
            c[j] = b[i];
            j++;
         }
      }
      //no kth minimum value? (combine 2nd and 3rd condition using c.length)
      if (k < 1 || k > c.length) {
         throw new IllegalArgumentException();
      }
      //all requirements met! find kth minimum
      else {
         int i = c.length - 1;
         int l = c.length;
         while (c[i] == 0) {
            i--;
            l--;
         }
         int[] d = Arrays.copyOf(c, l);
         if (k > d.length) {
            throw new IllegalArgumentException();
         }
         else {
            kMin = d[k - 1];
         }
      }
      return kMin;
   }


   /**
    * Selects the kth maximum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth maximum value. Note that there is no kth
    * maximum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    * @param a - input array
    * @param k - kth maximum to find
    * @return kth maximum
    * @throws IllegalArgumentException - evaluation not possible.
    */
   public static int kmax(int[] a, int k) {
      int kMax = Integer.MIN_VALUE;
      //is a non-empty?
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      //create a copy to work with
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      //check for and remove duplicates
      int[] c = new int[b.length];
      c[0] = b[0];
      int j = 1; //position for array c
      for (int i = 1; i < b.length; i++) {
         if (b[i] != b[i - 1]) {
            c[j] = b[i];
            j++;
         }
      }
      //no kth maximum value? (combine 2nd and 3rd condition using c.length)
      if (k < 1 || k > c.length) {
         throw new IllegalArgumentException();
      }
      //all requirements met! find kth maximum
      else {
         int i = c.length - 1;
         int l = c.length;
         while (c[i] == 0) {
            i--;
            l--;
         }
         int[] d = Arrays.copyOf(c, l);
         if (k > d.length) {
            throw new IllegalArgumentException();
         }
         else {
            kMax = d[d.length - k];
         }
      }
      return kMax;
   }


   /**
    * Returns an array containing all the values in a in the
    * range [low..high]; that is, all the values that are greater
    * than or equal to low and less than or equal to high,
    * including duplicate values. The length of the returned array
    * is the same as the number of values in the range [low..high].
    * If there are no qualifying values, this method returns a
    * zero-length array. Note that low and high do not have
    * to be actual values in a. This method throws an
    * IllegalArgumentException if a is null or has zero length.
    * The array a is not changed by this method.
    * @param a - input array
    * @param low - lowest value printed
    * @param high - highest value printed
    * @return values of a between low and high
    * @throws IllegalArgumentException - evaluation not possible.
    */
    
   public static int[] range(int[] a, int low, int high) {
      //is a non-empty?
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      //create output array w/ correct length
      int j = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= low && a[i] <= high) {
            j++;
         }
      }
      int[] output = new int[j];
      //add elements to output
      j = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= low && a[i] <= high) {
            output[j] = a[i];
            j++;
         }
      }
      return output;
   }


   /**
    * Returns the smallest value in a that is greater than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    * @param a - input array
    * @param key - upperbound
    * @return a[i] <= key where a[i] is maximized
    * @throws IllegalArgumentException - evaluation not possible. 
    */
    
   public static int ceiling(int[] a, int key) {
      int ceiling = Integer.MAX_VALUE;
      int smallestDiff = Integer.MAX_VALUE;
      //is a non-empty?
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         for (int i = 0; i < a.length; i++) {
            //check for largest a[i] with smallest difference
            if (a[i] >= key && Math.abs(a[i] - key) < smallestDiff) {
               ceiling = a[i];
               smallestDiff = Math.abs(a[i] - key);
            }
         }
         //if no ceiling can be found
         if (ceiling == Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
         }
      }       
      return ceiling;
   }


   /**
    * Returns the largest value in a that is less than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    * @param a - input array
    * @param key - value for lowerbound
    * @return a[i] >= key where a[i] is minimized
    * @throws IllegalArgumentException - evaluation not possible.
    */
   public static int floor(int[] a, int key) {
      int floor = Integer.MAX_VALUE;
      int smallestDiff = Integer.MAX_VALUE;
      //is a non-empty?
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         for (int i = 0; i < a.length; i++) {
            //check for smallest a[i] with smallest difference
            if (a[i] <= key && Math.abs(key - a[i]) < smallestDiff) {
               floor = a[i];
               smallestDiff = Math.abs(key - a[i]);
            }
         }
         //if no floor can be found
         if (floor == Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
         }
      }
      return floor;
   }

}
