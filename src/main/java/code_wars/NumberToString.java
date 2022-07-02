package code_wars;

import org.junit.Test;
import static org.junit.Assert.*;
public class NumberToString {
    /**
     * Coloque um numero e ele sera convertido para o tipo de dado String
      * @param number Numero do tipo Int para ser convertido
     * @return A String gerada
     */
    public static String numberToString(int number){
        return ""+number;
    }

    @Test
    public void tests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("123", NumberToString.numberToString(123));
        assertEquals("999", NumberToString.numberToString(999));
    }
}
