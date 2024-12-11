
import java.util.Scanner;
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Main{
    static void reversePrint(SinglyLinkedListNode head) {
        if (head == null) {
            return; 
        }
        reversePrint(head.next);
        System.out.println(head.data);
    }
    static SinglyLinkedListNode insertNode(SinglyLinkedListNode head, int data) {
        if (head == null) {
            return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new SinglyLinkedListNode(data);
        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 

            SinglyLinkedListNode head = null;
            for (int j = 0; j < n; j++) {
                int element = scanner.nextInt();
                head = insertNode(head, element);
            }

            reversePrint(head); 
        scanner.close();
    }
}
}




 
 
 
 
 
 
