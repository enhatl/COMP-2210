import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Min of three tests.
 * @author Emily Hollingshead - COMP 2210
 */
 
public class MinOfThreeTest {
   /** Min 1 test method. */
   @Test public void min1Test() {
      int expected = 0;
      int actual = MinOfThree.min1(0, 1, 2);
      assertEquals(expected, actual);
   }
   
   /** Min 2 test method. */
   @Test public void min2Test() {
      int expected = 0;
      int actual = MinOfThree.min2(0, 1, 2);
      assertEquals(expected, actual);
   }
}
