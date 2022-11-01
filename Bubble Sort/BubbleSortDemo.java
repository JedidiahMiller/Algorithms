import java.util.Random;

public class BubbleSortDemo {

    public static void main(String args[]) {

        runDemo();
        
    }

    public static void runDemo() {

        int[] array = new int[10];

        Random rand = new Random();

        for(int i = 0; i<10; i++) {
            array[i] = rand.nextInt(1000);
        }

        System.out.println("Unsorted Array");
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i]);

            if(i != (array.length -1)) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        int[] sorted = BubbleSort.sort(array);

        System.out.println("Array after running bubble sort");
        for(int i = 0; i<array.length; i++) {
            System.out.print(sorted[i]);

            if(i != (sorted.length -1)) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

    }
}