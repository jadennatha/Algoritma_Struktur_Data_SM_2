package ScavengerHunt;

public class Node {
    String question;
    String answer;
    Node next;
    Node prev;

    public Node(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
        this.prev = null;
    }
}
