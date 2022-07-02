package code_wars;

public class Maps {
    public static int[] map(int[] numbers){
        int[] new_array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            new_array[i] = numbers[i]*2;
        }
        return new_array;
    }

}
