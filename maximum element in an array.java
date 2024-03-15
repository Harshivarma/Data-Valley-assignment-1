/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
[6:24 pm, 13/03/2024] Nishitha😍: Sorry an array
[6:25 pm, 13/03/2024] Nishitha😍: public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 9, 8, 3};

        int maxElement = findMaximum(array);

        System.out.println("Maximum element in the array: " + maxElement);
    }

    // Method to find the maximum element in the array
    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = array[0]; // Assume the first element as maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
