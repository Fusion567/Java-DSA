public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null; // Edge case: Empty list
        }

        // Create a dummy node to simplify edge cases (e.g., removing the first node)
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;

        // Move `first` pointer n+1 steps ahead to maintain a gap of n between `first` and `second`
        for (int i = 0; i <= n; i++) {
            if (first == null) {
                return head; // Edge case: n is greater than the length of the list
            }
            first = first.next;
        }

        // Move both pointers until `first` reaches the end of the list
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        // Return the head of the updated list
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        
        // Remove the 2nd node from the end (Expected result: 1 -> 2 -> 3 -> 5)
        int n = 2;
        head = solution.removeNthFromEnd(head, n);

        // Print the updated linked list
        printList(head);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
