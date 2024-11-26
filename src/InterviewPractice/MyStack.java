package InterviewPractice;

public class MyStack {
    private int size;
    private MyNode first;
    private MyNode top;

    public MyStack() {
        this.size = 0;
    }

    public void push(MyNode myNode) {
        if (size == 0) {
            first = top = myNode;
        } else {
            myNode.setNext(top);
            top = myNode;
        }
        size++;
    }

    public void printStack() {
        MyNode current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void peek() {
        if (size == 0) {
            System.out.println("Nothing to peek.");
        } else {
            System.out.println(getTop().getValue());
        }
    }

    public void pop() {
        if (size == 0) {
            System.out.println("Nothing to pop.");
        } else {
            top = top.getNext();
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public MyNode getFirst() {
        return first;
    }

    public void setFirst(MyNode first) {
        this.first = first;
    }

    public MyNode getTop() {
        return top;
    }

    public void setTop(MyNode top) {
        this.top = top;
    }
}
