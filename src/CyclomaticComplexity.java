public class CyclomaticComplexity {

    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {10, -5};
        for (int number : numbers) {
            if (number > 0) {
                sum = sum + number;
            } else {
                sum = sum - number;
            }
        }
    }
}
