 import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberInAnArray {

    public static void main(String[] args) {

        // Initialize an array with integers
        int[] numbers = {3, 5, 3, 2, 8, 3, 9, 6, 5, 5, 5};

        // We are using hash map to track the frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        for (int number : numbers) {

            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        // This block determines the most frequent number
        int mostFrequent = numbers[0];
        int maxCount = 1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Print the most frequent number
        System.out.println("The most frequent number in the array is: " + mostFrequent);
    }

}
