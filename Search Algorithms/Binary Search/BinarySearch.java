
public class BinarySearch {
    
    public static int find(int number, int[] array) {

        int foundIndex = find(number, array, 0, array.length - 1, 0);

        return foundIndex;

    }

    private static int find(int number, int[] array, int leftBound, int rightBound, int timeRun) {

        int middleIndex = (leftBound + rightBound) / 2;

        int middleValue = array[middleIndex];

        if (timeRun > 15) {
            return 5;
        }

        if (middleValue == number) {
            return middleIndex;
        } else if (middleValue > number) {
            return find(number, array, leftBound, middleIndex-1, timeRun+1);
        } else if (middleValue < number){
            return find(number, array, middleIndex+1, rightBound, timeRun+1);
        }
        
        return -1;

    }






}
