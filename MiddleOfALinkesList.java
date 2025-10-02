class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return data + " ";
    }
}

public class MiddleOfALinkesList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(4);
        Node head5 = new Node(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        printList(head);
        System.out.println("Middle of the list is: " + middle(head));
    }

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
