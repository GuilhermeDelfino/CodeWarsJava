package code_wars;

public class SumArray {
    /**
     * Pega um array e soma os numeros dentro dele
     * @param numbers numeros para serem somados
     * @return soma dos numeros
     */
    public static double sum(double[] numbers) {
        double finalValue = 0;
        for(double num: numbers){
            finalValue+=num;
        }
        return finalValue;
    }
}
