
public class BinarySearchTreeDemo {

    public static void main(String args[]) {

        runDemo();
        
    }

    // Incomplete Demo
    public static void runDemo() {

        BinaryTree tree = new BinaryTree();

        Node masterNode = new Node(5);

        tree.addNode(masterNode);

        System.out.println(tree.masterNode.number);
    }
}