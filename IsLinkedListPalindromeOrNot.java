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

public class IsLinkedListPalindromeOrNot {
    public static void main(String[] args) {
        Node head_pal = new Node(1);
        head_pal.next = new Node(2);
        head_pal.next.next = new Node(3);
        head_pal.next.next.next = new Node(2);
        head_pal.next.next.next.next = new Node(1);
        // System.out.print("List 1: ");
        printList(head_pal);
        System.out.println("Is the list 1 palindrome? " + isPalindrome(head_pal));

        Node head_non = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(2);
        Node head5 = new Node(10);
        head_non.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        // System.out.print("List 2: ");
        printList(head_non);
        System.out.println("Is the list 2 palindrome? " + isPalindrome(head_non));
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = middleNode(head);

        Node secondHalfHead = middle;

        Node rev = reverseLinkedList(secondHalfHead);

        Node firstHalf = head;
        Node reversedHalf = rev;

        boolean isPal = true;

        while (reversedHalf != null) {
            if (firstHalf.data != reversedHalf.data) {
                isPal = false;
                break;
            }
            firstHalf = firstHalf.next;
            reversedHalf = reversedHalf.next;
        }

        reverseLinkedList(rev);

        return isPal;
    }

    public static Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
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