package InterviewPractice;

// we use current and parent variables. parent value holds the value to cover the current = null situation.
public class MyBinarySearchTree {
    private MyTreeNode root;
    private int size;

    public void addTreeNode(MyTreeNode myTreeNode) {
        if (root == null) {
            root = myTreeNode;
            size++;
            return;
        }

        MyTreeNode current = root;
        MyTreeNode parent = null;

        while (current != null) {
            parent = current;

            if (myTreeNode.getValue() < current.getValue()) {
                current = current.getLeft();
            } else if (myTreeNode.getValue() > current.getValue()) {
                current = current.getRight();
            }
            else { // for duplicates
                return;
            }
        }


        if (myTreeNode.getValue() < parent.getValue()) {
            parent.setLeft(myTreeNode);
        } else {
            parent.setRight(myTreeNode);
        }

        size++;
    }


    public MyBinarySearchTree() {
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public MyTreeNode getRoot() {
        return root;
    }

    public void setRoot(MyTreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }
}
