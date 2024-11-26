package InterviewPractice;

public class MyQueue {
    private int size;
    private MyNode front;
    private MyNode rear;

    public MyQueue() {
        this.size = 0;
    }

    public void enqueue(MyNode nodeToAdd) {
        if (isEmpty()) {
            front = rear = nodeToAdd;
        } else {
            nodeToAdd.setNext(rear);
            rear = nodeToAdd;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Nothing to dequeue.");
        } else {
            rear = rear.getNext();
            size--;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Nothing to peek at.");
        } else {
            System.out.println();
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public MyNode getFront() {
        return front;
    }

    public void setFront(MyNode front) {
        this.front = front;
    }

    public MyNode getRear() {
        return rear;
    }

    public void setRear(MyNode rear) {
        this.rear = rear;
    }
}
