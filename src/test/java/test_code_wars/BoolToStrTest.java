package test_code_wars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import code_wars.BooleanToString;
public class BoolToStrTest {

    @Test
    public void tests(){
        assertEquals(BooleanToString.convert(true), "true");
        assertEquals(BooleanToString.convert(false), "false");
    }
}
