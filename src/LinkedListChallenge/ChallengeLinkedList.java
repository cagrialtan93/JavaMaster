package LinkedListChallenge;

public class ChallengeLinkedList{
    private LinkedListNode head;
    private int size = 0;
    private boolean isDone = true;


    public void addToStart(LinkedListNode linkedListNode) {
        if (size == 0) {
            head = linkedListNode;
        } else {
            linkedListNode.setNext(head);
            head = linkedListNode;
        }
        size++;
    }

    public void addInOrder(LinkedListNode linkedListNode) {
        if (size == 0) {
            head = linkedListNode;
            size++;
        } else {
            LinkedListNode current = head;

            while (current.getNext() != null && current.getNext().getDistanceFromSydney() < linkedListNode.getDistanceFromSydney()) {
                current = current.getNext();
            }

            linkedListNode.setNext(current.getNext());
            current.setNext(linkedListNode);
        }
    }

    public void printLinkedList() {
        if (size == 0) {
            System.out.println("Nothing to print.");
        } else {
            LinkedListNode current = head;
            while (current != null) {
                System.out.println(current.getTown() + " - " + current.getDistanceFromSydney() + "km");
                current = current.getNext();
            }
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
