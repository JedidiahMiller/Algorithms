
public class MergeSort {

    // This merge sort works on a single array, swapping elements around 

    public static int[] sort(int[] arrayToSort) {

        return splitAndMerge(arrayToSort, 0);

    }

    private static int[] splitAndMerge(int[] array, int layer) {

        if(array.length == 1) {
            return array;
        }

        int leftLength = array.length/2;
        int rightLength = array.length - leftLength;

        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for(int i = 0; i < array.length; i++) {
            if(i < leftLength) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - leftLength] = array[i];
            }
        }

        int[] finalR =  mergeArrays(splitAndMerge(leftArray, layer + 1), splitAndMerge(rightArray, layer + 1));

        return finalR;

    }

    // Helper function
    // Could throw in a polymorphic function that takes two ints to deal with base case. Might be faster?
    public static int[] mergeArrays(int[] leftArray, int[] rightArray) {

        int leftIndex = 0;
        int rightIndex = 0;

        int[] mergedArray = new int[leftArray.length + rightArray.length];

        int index = 0;

        while(leftIndex < (leftArray.length) && rightIndex < (rightArray.length)) {

            if(leftArray[leftIndex] < rightArray[rightIndex]) {
                mergedArray[index] = leftArray[leftIndex];
                leftIndex++;
                index++;
            } else {
                // equal values means right one goes first
                mergedArray[index] = rightArray[rightIndex];
                rightIndex++;
                index++;
            }

        }

        // Throw on straggelers

        while (leftIndex < (leftArray.length)) {
            mergedArray[index] = leftArray[leftIndex];
            index++;
            leftIndex++;
        }

        while (rightIndex < (rightArray.length)) {
            mergedArray[index] = rightArray[rightIndex];
            index++;
            rightIndex++;
        }

        return mergedArray;

    }



}