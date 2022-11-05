public class BinarySearchDemo extends SearchDemo {

    public static void main(String args[]) {

        BinarySearchDemo demo = new BinarySearchDemo();

        demo.runTests(1000, 100);

    }

    public void runDemo() {

        int searchArraySize = 20;

        int[] testArray = createSortedArray(searchArraySize);

        int numberToFind = randomNumber(searchArraySize);

        int foundAtIndex = BinarySearch.find(numberToFind, testArray);

        printArray(testArray, "Finding " + numberToFind +  " in array");
        System.out.println("Number found at index " + foundAtIndex);

    }

    public int runSearch(int number, int[] array) {
        return BinarySearch.find(number, array);
    }
    
}
