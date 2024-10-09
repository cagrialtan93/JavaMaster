public class CustomStack {
    private LinkedListNode top;
    private int size;

    public CustomStack() {
        this.size = 0;
    }

    public void push(LinkedListNode nodeToAdd) {
        nodeToAdd.setNext(top);
        top = nodeToAdd;
        size++;
    }

    public void pop() {
        if (size == 0) {
            System.out.println("Not happening.");
        } else {
            top = top.getNext();
            size--;
        }
    }

    public void printStack() {
        LinkedListNode current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void getTop() {
        try {
            System.out.println(top.getValue());
        } catch (Exception e) {
            System.out.println("You can't get top because it's empty!");
        }
    }

    public void setTop(LinkedListNode top) {
        this.top = top;
    }
}
