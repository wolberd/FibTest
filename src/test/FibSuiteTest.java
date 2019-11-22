package test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FibonacciTest.class,
        FibonacciSimpleTest.class,
})

public class FibSuiteTest {
    // This class remains empty, it is used only as a holder for the above annotations
}
