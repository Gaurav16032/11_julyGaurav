import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array1 = {12, 45, 67, 23, 54};

        // Sort the array in descending order
        Arrays.sort(array1);
        int n = array1.length;
        int[] descendingArray = new int[n];
        for (int i = 0; i < n; i++) {
            descendingArray[i] = array1[n - 1 - i];
        }

        // Find the second maximum number using indexing
        int secondMax = descendingArray[1];

        // Print the array in descending order and the second maximum number
        System.out.println("Array in Descending Order: " + Arrays.toString(descendingArray));
        System.out.println("Second Maximum Number: " + secondMax);
    }
}
