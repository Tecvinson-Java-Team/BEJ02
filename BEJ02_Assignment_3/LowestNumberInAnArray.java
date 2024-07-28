public class LowestNumberInAnArray {
    public static void main(String[] args) {

        // Initialize an array with non-negative integers
        int[] numbers = {3, 5, 7, 2, 8, 1, 9, 6};

        // Assume the first element is the lowest
        int lowest = numbers[0];

        // Iterate through the array to find the lowest number
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Print the lowest number
        System.out.println("The lowest number in the array is: " + lowest);
    }
}
