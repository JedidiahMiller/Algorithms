
public class MergeSortDemo extends SortingDemo {
    public static void main(String args[]) {

        MergeSortDemo demo = new MergeSortDemo();

        demo.runDemo();

    }

    public void runDemo() {

        int[] test = createArrayOfRandomInts(20);

        int[] result = MergeSort.sort(test);

        printArray(test, "Input");
        printArray(result, "Output");

    }

}
