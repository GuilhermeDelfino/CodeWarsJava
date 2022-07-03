package code_wars;

public class OppositesAttract {
    /**
     * they will only know once they pick a flower each.
     * If one of the flowers has an even number of petals and the other has
     * an odd number of petals it means they are in love.
     * @param petal_timmy amount of petals on Timmy's flower
     * @param petal_sarah amount of petals on Sarah's flower
     * @return if true, is a big love, else...
     */
    public static boolean isLove(final int petal_timmy, final int petal_sarah){
        boolean is_sarah_odd_timmy_even = isOdd(petal_sarah) && !isOdd(petal_timmy);
        boolean is_sarah_even_timmy_odd = isOdd(petal_timmy) && !isOdd(petal_sarah);

        return is_sarah_even_timmy_odd || is_sarah_odd_timmy_even;
    }

    public static boolean isOdd(int number){
        return number % 2 == 0;
    }

}
