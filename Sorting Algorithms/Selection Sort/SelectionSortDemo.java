
public class SelectionSortDemo extends SortingDemo {

    public static void main(String args[]) {


        SelectionSortDemo demo = new SelectionSortDemo(); 

        demo.runDemo();
        
    }

    public void runDemo() {

        int[] test = createArrayOfRandomInts(20);

        printArray(test, "Input");

        int[] result = SelectionSort.sort(test);

        printArray(result, "Output");
    }
    
}
