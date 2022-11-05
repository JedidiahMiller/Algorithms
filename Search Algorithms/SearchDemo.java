
import java.util.Random;

public abstract class SearchDemo {
    

    // Requirements
    public abstract void runDemo();
    public abstract int runSearch(int number, int[] array);

    // Testing function
    public void runTests(int testCaseNumber, int testArraySize) {

        int fails = 0;

        System.out.println("Running search test (" + testCaseNumber + " times)");

        for(int i = 0; i <testCaseNumber; i++) {

            int[] testArray = createSortedArray(testArraySize);

            int numberToFind = randomNumber(testArraySize);

            printArray(testArray, "Test " + (i+1) + ", finding " + numberToFind + " in");
            int foundAtIndex = runSearch(numberToFind, testArray);

            if (testArray[foundAtIndex] != numberToFind) {
                fails++;
                System.out.println("Error");
                System.out.println("Search result was index " + foundAtIndex);
            }

        }

        System.out.println("Finished");
        System.out.println((testCaseNumber-fails) + "/" + testCaseNumber + " success rate");
    }

    // Helper Functions

    public int[] createSortedArray(int length) {

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = i+1;
        }

        return array;
    }

    // Random number with default left bound of 1
    public int randomNumber(int a, int b) {

        Random rand = new Random();

        int value = 0;

        value = rand.nextInt(b-a-1);
        
        return a+value+1;

    }

    public int randomNumber(int b) {
        return randomNumber(1, b);
    }


    // Print array (copied from sort demo)
    public static void printArray(int[] array) {
        System.out.print("(");
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i]);

            if(i != (array.length -1)) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
        System.out.println();
    }

    public static void printArray(int[] array, String description) {
        System.out.print(description + " ");
        printArray(array);
    }


}
