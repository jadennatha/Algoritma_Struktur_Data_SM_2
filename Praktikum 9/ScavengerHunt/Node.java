package ScavengerHunt;

public class Node {
    String question;
    String answer;
    Node next;

    public Node(String question, String answer, Node next) {
        this.question = question;
        this.next = next;
        this.answer = answer;
    }
}
