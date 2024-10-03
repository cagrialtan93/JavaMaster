public class SinglyLinkedList {
    private LinkedListNode head;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void addToStart(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = nodeToAdd;
        } else {
            nodeToAdd.setNext(head);
            head = nodeToAdd;
        }
        size++;
    }

    public void addToSortedSinglyLinkedList(LinkedListNode nodeToAdd) {
        LinkedListNode current = head;
        while (current.getNext() != null && nodeToAdd.getValue() > current.getValue()) {
            current = current.getNext();
        }
        nodeToAdd.setNext(current);
    }

    public void printSinglyLinkedList() {
        LinkedListNode current = head;
        while (current.getNext() != null) {
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
