package test_code_wars;
import code_wars.RentalCarCost;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RentalCarCostTest {
    @Test
    public void under3Tests() {
        assertEquals(40, RentalCarCost.rentalCarCost(1));
        assertEquals(80, RentalCarCost.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, RentalCarCost.rentalCarCost(3));
        assertEquals(140, RentalCarCost.rentalCarCost(4));
        assertEquals(180, RentalCarCost.rentalCarCost(5));
        assertEquals(220, RentalCarCost.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(350, RentalCarCost.rentalCarCost(10));
        assertEquals(270, RentalCarCost.rentalCarCost(8));
        assertEquals(230, RentalCarCost.rentalCarCost(7));
        assertEquals(310, RentalCarCost.rentalCarCost(9));
    }}
