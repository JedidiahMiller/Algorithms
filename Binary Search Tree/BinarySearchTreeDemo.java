
public class BinarySearchTreeDemo {

    public static void main(String args[]) {

        runDemo();
        
    }

    // Incomplete Demo
    // Search tree has not been properly finished or tested
    // Demo currently is just a way to make sure major functions aren't crashing 
    public static void runDemo() {

        BinaryTree tree = new BinaryTree();

        Node masterNode = new Node(5);

        tree.addNode(masterNode);

        System.out.println(tree.masterNode.number);
    }
}
