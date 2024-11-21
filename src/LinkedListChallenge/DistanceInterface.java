package LinkedListChallenge;

import java.util.Scanner;

public class DistanceInterface {
    static Scanner scanner = new Scanner(System.in);
    static ChallengeLinkedList challengeLinkedList;
    static Boolean isDone = false;
    static LinkedListNode current;

    public static void main(String[] args) {
        challengeLinkedList = new ChallengeLinkedList();
        LinkedListNode adelaide = new LinkedListNode("Adelaide", 1374);
        LinkedListNode aliceSprings = new LinkedListNode("Alice Springs", 2771);
        LinkedListNode manisa = new LinkedListNode("Manisa", 1600);
        LinkedListNode istanbul = new LinkedListNode("İstanbul", 1102);
        LinkedListNode reykjavik = new LinkedListNode("Reykjavik", 16605);

        challengeLinkedList.addInOrder(aliceSprings);
        challengeLinkedList.addInOrder(adelaide);
        challengeLinkedList.addInOrder(manisa);
        challengeLinkedList.addInOrder(istanbul);
        challengeLinkedList.addInOrder(reykjavik);

        current = challengeLinkedList.getHead();

        String menu = """
                Available actions (select letter):\s
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """;

        System.out.println(menu);

        String actionChoice = scanner.next();

        while (!actionChoice.equalsIgnoreCase("Q")){
            if (actionChoice.equalsIgnoreCase("F")) {
                if (current != null) {
                    System.out.println(current.getTown());
                    current = current.getNext();
                } else {
                    System.out.println("You are at the end of the list.");
                }
            }
            else if (actionChoice.equalsIgnoreCase("B")){
                System.out.println(challengeLinkedList.getHead().getNext().getTown());
            } else if (actionChoice.equalsIgnoreCase("L")){
                challengeLinkedList.printLinkedList();
            } else if (actionChoice.equalsIgnoreCase("M")){
                System.out.println(menu); // TODO
            }

            actionChoice = scanner.nextLine();
        }
    }
}
