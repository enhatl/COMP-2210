/**
 * Applies the linear scan strategy to counting the number of negative
 * values in an array.
 */
public class CountNegatives {

    /**
     * Returns the number of negative values in the given array.
     */
    public static int countNegatives(int[]a) {
        neg=0;
        for{i=0;i<a.length;i++}
            if(i>0)
                neg = neg+1;
        return neg;
        
    }
}
