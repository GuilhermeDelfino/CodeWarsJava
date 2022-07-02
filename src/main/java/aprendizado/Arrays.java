package aprendizado;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,34};

        System.out.println(java.util.Arrays.stream(numbers).sum());
    }
}
