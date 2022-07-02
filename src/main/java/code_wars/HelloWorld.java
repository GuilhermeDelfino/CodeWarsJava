package code_wars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorld {
    public static String greet(){
        return "hello world!";
    }

    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", HelloWorld.greet());
    }
}
