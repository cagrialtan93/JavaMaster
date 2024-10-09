public class CircularSinglyLinkedList {
    private LinkedListNode head;
    private LinkedListNode last;
    private int size;

    public CircularSinglyLinkedList() {
        this.size = 0;
    }

    public void insertToStart(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = last = nodeToAdd;
            head.setNext(nodeToAdd);
        } else {
            last.setNext(nodeToAdd);
            nodeToAdd.setNext(head);
            head = nodeToAdd;
        }
        size++;
    }

    public void insertToEnd(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = last = nodeToAdd;
            last.setNext(nodeToAdd);
        } else {
            nodeToAdd.setNext(head);
            last.setNext(nodeToAdd);
            last = nodeToAdd;
        }
        size++;
    }

    public void removeFirstNode() {
        if (size == 0) {
            System.out.println("Not happening.");
        } else {
            last.setNext(head.getNext());
            head = head.getNext();
        }
    }

    public void printCircularLinkedList() {
        LinkedListNode current = head;

        do {
            System.out.println(current.getValue());
            current = current.getNext();
        } while (current != head);
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void sethead(LinkedListNode head) {
        this.head = head;
    }

    public LinkedListNode getLast() {
        return last;
    }

    public void setLast(LinkedListNode last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
