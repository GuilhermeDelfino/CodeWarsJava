package test_code_wars;

import org.junit.Assert;
import org.junit.Test;
import code_wars.BasicOperations;
public class BasicOperationsTest {
    @Test
    public void allTests(){
        Assert.assertSame(11, BasicOperations.basicMath("+", 4, 7));
        Assert.assertSame(-3, BasicOperations.basicMath("-", 15, 18));
        Assert.assertSame(25, BasicOperations.basicMath("*", 5, 5));
        Assert.assertSame(7, BasicOperations.basicMath("/", 49, 7));
    }
}
