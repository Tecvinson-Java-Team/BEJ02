public class GreatestNumberInAnArray {
    public static void main(String[] args) {

        // Initialize an array with non-negative integers
        //1, 2, 3, 4, 5, 6, 7, 8 - length of the array
        int[] numbers = {3, 5, 7, 2, 8, 1, 9, 6, 11,23,56};
        //0,1 , 2, 3 , 4, 5,6, 7 - array index

        // Assume the first element is the greatest
        int greatest = numbers[0];

        // Iterate through the array to find the greatest number
        for (int i= 1; i < numbers.length; i++) {

            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }


        // Print the greatest number
        System.out.println("The greatest number in the array is: " + greatest);
    }

}
