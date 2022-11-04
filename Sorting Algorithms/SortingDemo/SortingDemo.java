
import java.util.Random;

public abstract class SortingDemo {

    // Requirements

    public abstract void runDemo();

    // Helper functions

    public static int[] createArrayOfRandomInts(int size) {

        int[] array = new int[size];

        Random rand = new Random();

        for(int i = 0; i<size; i++) {
            array[i] = rand.nextInt(1000);
        }

        return array;

    }

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
        System.out.print(description + ": ");
        printArray(array);
    }

}