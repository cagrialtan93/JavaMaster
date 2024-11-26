package InterviewPractice;

public class MyNode {
    private int value;
    private MyNode next;

    public MyNode(int value) {
        this.value = value;
        this.setNext(null);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
