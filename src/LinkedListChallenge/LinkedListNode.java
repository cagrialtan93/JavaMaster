package LinkedListChallenge;

public class LinkedListNode {
    private String town;
    private int distanceFromSydney;
    private LinkedListNode next;

    public LinkedListNode(String town, int distanceFromSydney) {
        this.town = town;
        this.distanceFromSydney = distanceFromSydney;
        this.setNext(null);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getDistanceFromSydney() {
        return distanceFromSydney;
    }

    public void setDistanceFromSydney(int distanceFromSydney) {
        this.distanceFromSydney = distanceFromSydney;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
