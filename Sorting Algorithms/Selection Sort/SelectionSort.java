
public class SelectionSort {
    
    public static int[] sort(int[] array) {

        int[] returnArray = array;

        for(int start = 0; start < returnArray.length; start++) {

            int smallest = start;

            for (int index = start; index < returnArray.length; index++) {

                if (returnArray[index] < returnArray[smallest]) {
                    smallest = index;
                }

            }

            int holder = returnArray[start];
            returnArray[start] = returnArray[smallest];
            returnArray[smallest] = holder;
            
        }

        return returnArray;

    }
}
