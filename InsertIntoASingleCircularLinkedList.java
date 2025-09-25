import java.util.Scanner;

public class InsertIntoASingleCircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularLinkedList {
        Node head;

        // Method to build the circular linked list from an array of ratings
        public void buildList(int[] ratings) {
            if (ratings == null || ratings.length == 0) {
                this.head = null;
                return;
            }

            this.head = new Node(ratings[0]);
            Node current = this.head;
            for (int i = 1; i < ratings.length; i++) {
                current.next = new Node(ratings[i]);
                current = current.next;
            }
            // Make the list circular
            current.next = this.head;
        }

        // Method to insert a new node into the sorted circular linked list
        public void insert(int newRating) {
            Node newNode = new Node(newRating);

            // Case 1: The list is empty
            if (this.head == null) {
                this.head = newNode;
                newNode.next = newNode;
                return;
            }

            Node current = this.head;
            Node prev = null;

            // Traverse the list to find the insertion point
            // This loop handles all cases: middle, end, and beginning of the list
            do {
                prev = current;
                current = current.next;

                // Case 2: Insertion in the middle of the list
                // or at the beginning if the new node is the smallest
                if ((prev.data <= newRating && newRating <= current.data) ||
                // Case 3: Insertion at the "end" (between the last and first node)
                // This handles the circular loop where prev > current
                        (prev.data > current.data && (newRating >= prev.data || newRating <= current.data))) {
                    break;
                }
            } while (current != this.head);

            // Insert the new node
            prev.next = newNode;
            newNode.next = current;

            // Update head if the new node is the smallest and is inserted at the beginning
            if (newRating < this.head.data) {
                this.head = newNode;
            }
        }

        // Method to print the list, traversing exactly one full cycle
        public void printList() {
            if (this.head == null) {
                System.out.println("The schedule is empty.");
                return;
            }

            Node current = this.head;
            do {
                System.out.print(current.data);
                current = current.next;
                if (current != this.head) {
                    System.out.print(", ");
                }
            } while (current != this.head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read existing team ratings
        String ratingsInput = scanner.nextLine();
        int[] ratings;
        if (ratingsInput.isEmpty()) {
            ratings = new int[0];
        } else {
            String[] ratingStrings = ratingsInput.split(",");
            ratings = new int[ratingStrings.length];
            for (int i = 0; i < ratingStrings.length; i++) {
                ratings[i] = Integer.parseInt(ratingStrings[i].trim());
            }
        }

        // Read new team's rating
        int newRating = scanner.nextInt();
        scanner.close();

        CircularLinkedList list = new CircularLinkedList();
        list.buildList(ratings);
        list.insert(newRating);
        list.printList();
    }
}