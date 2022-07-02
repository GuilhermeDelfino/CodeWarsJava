package code_wars;

public class RentalCarCost {
    private static final int COST_PER_DAY = 40;
    private static final int DISCOUNT_ABOVE_TWO = 20;
    private static final int DISCOUNT_ABOVE_SIX = 50;
    private static final int MIN_DAYS_SMALL_DISCOUNT = 2;
    private static final int MIN_DAYS_BIG_DISCOUNT = 6;
    public static int rentalCarCost(int count_days){
        int total_cost = count_days * COST_PER_DAY;
        return total_cost -
                (count_days > MIN_DAYS_BIG_DISCOUNT?DISCOUNT_ABOVE_SIX:
                        count_days>MIN_DAYS_SMALL_DISCOUNT?
                                DISCOUNT_ABOVE_TWO:0);
    }
}
