public class ArraytoLL {

    public static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static Node removeHead(Node head) {
        if (head == null) {
            System.out.println("Empty list, nothing to remove.");
            return null;
        }

        Node newHead = head.next;
        head.next = null; // Disconnect the current head from the list

        System.out.println("Removed head with data: " + head.data);
        return newHead;
    }

    public static Node removeTail(Node head) {
        if (head == null) {
            System.out.println("Empty list, nothing to remove.");
            return null;
        }

        if (head.next == null) {
            // The list has only one element, remove the head
            System.out.println("Removed tail with data: " + head.data);
            return null;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null; // Disconnect the tail node
        System.out.println("Removed tail with data: " + current.data);

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7};
        Node head = convertArrToLL(arr);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = removeHead(head);

        System.out.println("Linked List after removing head:");
        printLinkedList(head);

        head = removeTail(head);

        System.out.println("Linked List after removing tail:");
        printLinkedList(head);
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
