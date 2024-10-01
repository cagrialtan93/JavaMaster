public class LinkedListNode {
    private LinkedListNode next;
    private LinkedListNode prev;

    public LinkedListNode() {
        this.next = null;
        this.prev = null;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }
}

