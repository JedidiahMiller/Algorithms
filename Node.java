

public class Node {

    int number;
    Node parentNode, leftChildNode, rightChildNode;

    public Node(int number) {
        this.number = number;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public void setChild(Node newChild, String side) {
        if (side.equals("l") || side.equals("left")) {
            this.leftChildNode = newChild;
        } else if (side.equals("r") || side.equals("right")) {
            this.rightChildNode = newChild;
        }
    }

}