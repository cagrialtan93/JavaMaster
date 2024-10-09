import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.source.tree.BreakTree;

import java.text.DecimalFormat;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList firstLinkedList = new CircularSinglyLinkedList();

        LinkedListNode firstNode = new LinkedListNode(3);
        LinkedListNode secondNode = new LinkedListNode(4);
        LinkedListNode thirdNode = new LinkedListNode(8);
        LinkedListNode fourthNode = new LinkedListNode(2);

        LinkedListNode fifthNode = new LinkedListNode(6);
        LinkedListNode sixthNode = new LinkedListNode(7);
        LinkedListNode seventhNode = new LinkedListNode(99);
        LinkedListNode eighthNode = new LinkedListNode(2);

        firstLinkedList.addToStart(firstNode);
        firstLinkedList.addToStart(secondNode);
        firstLinkedList.addToStart(thirdNode);
        firstLinkedList.addToStart(fourthNode);

        firstLinkedList.printCircularLinkedList();
    }
}
