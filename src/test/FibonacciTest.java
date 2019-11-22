package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import main.Fibonacci;

@RunWith(Parameterized.class)
public class FibonacciTest {

    // directive specifying that a static method follows that will return the
    // data for the tests as a Collection of Object arrays.
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 4 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
        });
    }

    /* note: the below method also works: the @Parameter just needs a method that returns
        a Collection of arrays of objects, and the method can be named anything.

        public static Collection<Object[]> data2() {
        Object[][] arr={{0,0},{1,1},{2,1}};
        return Arrays.asList(arr);
    }
    */

    // number of data members must match the number of items in arrays specified above
    private int fInput;

    private int fExpected;

    // need constructor
    public FibonacciTest(int input, int expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }
}
