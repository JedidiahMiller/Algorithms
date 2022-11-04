
public class BubbleSort {

    public static int[] sort(int[] array) {
        return bubbleToIndex(array, array.length - 1);
    }

    private static int[] bubbleToIndex(int[] array, int index) {

        if (index == 0) {
            return array;
        } 

        for(int i = 1; i <= index; i++) {
            if(array[i-1] > array[i]) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
            }
        }
        return bubbleToIndex(array, index-1);
    }

    

}