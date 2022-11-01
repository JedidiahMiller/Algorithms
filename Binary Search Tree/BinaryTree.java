

public class BinaryTree {

    Node masterNode;

    public BinaryTree() {}

    public BinaryTree(Node masterNode) {
        this.masterNode = masterNode;
    }
    
    public void setMasterNode(Node masterNode) {
        this.masterNode = masterNode;
    }

    public void addNode(Node newNode) {

        if (this.masterNode == null) {
            this.setMasterNode(newNode);
            return;
        }

        Node parent = findParent(newNode, this.masterNode);
        newNode.setParentNode(parent);

        if (newNode.number > parent.number) {
            parent.rightChildNode = newNode;
        } else if (newNode.number < parent.number) {
            parent.leftChildNode = newNode;
        }

    }

    private Node findParent(Node child, Node start) {

        if (child.number > start.number) {

            if (start.rightChildNode == null) {
                return start;
            } else {
                this.findParent(start.rightChildNode, child);
            }
            
        } else if (child.number > start.number) {

            if (start.leftChildNode == null) {
                return start;
            } else {
                this.findParent(start.leftChildNode, child);
            }
        }

        return null;
    }

    public String evenTree() {
        // Create array of all nodes
        // Sort the array
        // Split array in two, use middle node as master node
        // Repeat

        return null;
    }
}