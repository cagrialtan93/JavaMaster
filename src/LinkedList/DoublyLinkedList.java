package LinkedList;

public class DoublyLinkedList {
    private LinkedListNode head;
    private LinkedListNode last;
    private int size;

    public void addToStart(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = last = nodeToAdd;
        } else {
            nodeToAdd.setNext(head);
            head.setPrev(nodeToAdd);
            head = nodeToAdd;
        }
        size++;
    }

    public void deleteFirstNode() {
        if (size == 0) {
            System.out.println("Not happening.");
        } else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        size--;
    }

    public void deleteLastNode() {
        if (size == 0) {
            System.out.println("Not happening.");
        } else {
            last.getPrev().setNext(null);
            last = last.getPrev();
        }
        size--;
    }

    public void addToEnd(LinkedListNode nodeToAdd) {
        if (size == 0) {
            head = last = nodeToAdd;
        } else {
            last.setNext(nodeToAdd);
            nodeToAdd.setPrev(last);
            last = nodeToAdd;
        }
        size++;
    }


    public void printDoublyLinkedList() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public DoublyLinkedList() {
        this.size = 0;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
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
