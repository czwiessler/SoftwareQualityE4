/**
 * The CyclomaticComplexity class demonstrates a simple program to
 * calculate the sum of an array of integers, adjusting the sum based
 * on the sign of each integer.
 */
public class CyclomaticComplexity {

    /**
     * The main method is the entry point of the program. It initializes an
     * integer array, iterates over each element, and adds or subtracts
     * based on whether the element is positive or negative.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {        int sum = 0;
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
