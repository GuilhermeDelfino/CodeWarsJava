package code_wars;


import java.util.Objects;

public class CountPositivesSumNegatives {
    public static int [] countPositivesSumNegatives(int[] input){
        if(input == null || input.length <= 0) return new int[]{};
        int[] array_count_positives_sum_negatives = new int[]{0,0};
        for (Object in: input){
            if(in != null){
                if((int)in > 0) array_count_positives_sum_negatives[0]++;
                else array_count_positives_sum_negatives[1] += (int)in;
            }
        }
        return array_count_positives_sum_negatives;
    }
}
