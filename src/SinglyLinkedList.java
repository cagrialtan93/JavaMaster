import java.util.zip.ZipFile;

public class SinglyLinkedList {
    private LinkedListNode head;
    private LinkedListNode last;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void addToStart(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = last = nodeToAdd;
        } else {
            nodeToAdd.setNext(head);
            head = nodeToAdd;
        }
        size++;
    }

    public void addToLast(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = last = nodeToAdd;
        } else {
            last.setNext(nodeToAdd);
            last = nodeToAdd;
        }
        size++;
    }

    public void addToSorted(LinkedListNode linkedListNode){
        LinkedListNode current = head;
        LinkedListNode temp = null;

        while (current != null && current.getValue() < linkedListNode.getValue()){
            temp = current;
            current = current.getNext();
        }

        if (temp == null){
            addToStart(linkedListNode);
        } else {
            linkedListNode.setNext(current);
            temp.setNext(linkedListNode);
        }
        size++;
        System.out.println("Hello");
    }

    public void printSinglyLinkedList() {
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode temp = current.getNext();

            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
