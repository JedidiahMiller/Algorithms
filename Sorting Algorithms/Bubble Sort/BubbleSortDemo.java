
public class BubbleSortDemo extends SortingDemo {

    public static void main(String args[]) {


        BubbleSortDemo demo = new BubbleSortDemo(); 

        demo.runDemo();
        
    }

    public void runDemo() {

        int[] test = createArrayOfRandomInts(20);

        int[] result = BubbleSort.sort(test);

        printArray(test, "Input");
        printArray(result, "Output");
    }
}