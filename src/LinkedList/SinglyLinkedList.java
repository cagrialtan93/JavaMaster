package LinkedList;

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

    public void deleteFromStart() {
        if (size == 0) {
            System.out.println("not happening");
        } else {
            head = head.getNext();
        }
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

    public void addToSorted(LinkedListNode linkedListNode) {
        LinkedListNode current = head;
        LinkedListNode temp = null;

        while (current != null && current.getValue() < linkedListNode.getValue()) {
            temp = current;
            current = current.getNext();
        }

        if (temp == null) {
            addToStart(linkedListNode);
        } else {
            linkedListNode.setNext(current);
            temp.setNext(linkedListNode);
            size++;
        }
    }

    public void mergeTwoSortedList(SinglyLinkedList secondSinglyListList) {
        LinkedListNode currentSecondSinglyLinkedList = secondSinglyListList.getHead();
        while (currentSecondSinglyLinkedList != null){
            LinkedListNode linkedListNodeToAdd = new LinkedListNode(currentSecondSinglyLinkedList.getValue());
            addToSorted(linkedListNodeToAdd);
            currentSecondSinglyLinkedList = currentSecondSinglyLinkedList.getNext();
        }
    }


    public void mergeTwoSorted(SinglyLinkedList firstLinkedList, SinglyLinkedList secondLinkedList) {
        LinkedListNode secondListCurrent = secondLinkedList.getHead();

        while (secondListCurrent != null) {
            addToSorted(secondListCurrent);
            secondListCurrent = secondListCurrent.getNext();
            size++;
        }
    }

    public void deleteElementSinglyLinkedList(int value) {
        LinkedListNode current = head;
        LinkedListNode temp = null;
        while (current != null && current.getValue() != value) {
            temp = current;
            current = current.getNext();
        }
        if (current.getValue() == value) {
            if (current == head) {
                deleteFromStart();
            } else {
                temp.setNext(current.getNext());
            }
        } else {
            System.out.printf("i dont have the %d", value);
        }
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
