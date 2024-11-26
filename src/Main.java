import InterviewPractice.*;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.addTreeNode(new MyTreeNode(25));
        myBinarySearchTree.addTreeNode(new MyTreeNode(22));
        myBinarySearchTree.addTreeNode(new MyTreeNode(11));
        myBinarySearchTree.addTreeNode(new MyTreeNode(55));
        myBinarySearchTree.addTreeNode(new MyTreeNode(27));

    }

    static int sqrt(int n) {
        return sqrt_helper(n, 1, n);

    }

    static int sqrt_helper(int n, int min, int max) {
        if (max < min) return -1;

        int guess = (min + max) / 2;
        if (guess * guess == n) {
            return guess;
        } else if (guess * guess < n) {
            System.out.println("high" + guess + "max" + max);
            return sqrt_helper(n, guess + 1, max);
        } else {
            System.out.println("high" + guess + "max"  + max);
            return sqrt_helper(n, min, guess - 1);
        }
    }
}
