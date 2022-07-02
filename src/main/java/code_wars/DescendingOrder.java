package code_wars;
import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String num_string = String.valueOf(num);
        if(num_string.length() == 1) return num;
        int[] array_num_string = new int[num_string.length()];
        for (int i = 0; i < num_string.length(); i++){
            array_num_string[i] = Integer.parseInt(String.valueOf(num_string.charAt(i)));
        }
        StringBuilder final_number = new StringBuilder();
        for (int i = 0; i < array_num_string.length; i++){
            for (int j = array_num_string.length-1; j > 0; j--){
                if(array_num_string[j] > array_num_string[j-1]){
                    int temp = array_num_string[j-1];
                    array_num_string[j-1] = array_num_string[j];
                    array_num_string[j] = temp;
                }
            }
        };
       Arrays.stream(array_num_string).forEach(final_number::append);
        return Integer.parseInt(final_number.toString());
    }
}
