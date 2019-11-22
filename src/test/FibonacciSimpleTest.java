package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.Fibonacci;

public class FibonacciSimpleTest {
    @Test
    public void testZero() {
        int res=Fibonacci.compute(0);
        int expected=0;
        assertEquals(expected,res);
    }
    @Test
    public void testOne() {
        int res=Fibonacci.compute(1);
        int expected=0;
        assertEquals("Fib of one not correct:",expected,res);
    }
    @Test
    public void testFive() {
        int res=Fibonacci.compute(5);
        int expected=6;
        assertEquals(expected,res);
    }
}
