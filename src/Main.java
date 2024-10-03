import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.source.tree.BreakTree;

import java.text.DecimalFormat;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        LinkedListNode firstNode = new LinkedListNode(25);
        LinkedListNode secondNode = new LinkedListNode(27);
        LinkedListNode thirdNode = new LinkedListNode(29);
        LinkedListNode fourthNode = new LinkedListNode(75);
        LinkedListNode fifthNode = new LinkedListNode(0);

        singlyLinkedList.addToStart(fourthNode);
        singlyLinkedList.addToStart(thirdNode);
        singlyLinkedList.addToStart(secondNode);
        singlyLinkedList.addToStart(firstNode);

        singlyLinkedList.addToSortedSinglyLinkedList(fifthNode);
        singlyLinkedList.printSinglyLinkedList();

    }
}
