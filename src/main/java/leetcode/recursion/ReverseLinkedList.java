package leetcode.recursion;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
//        ListNode current = head;
//        while (current != null && current.next != null) {
//            ListNode next = current.next;
//            current.next = next.next;
//            next.next = head;
//            head = next;
//        }
//        return head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = next.next;
        next.next = head;
        head = next;
        return reverseList(head);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.printf("%d ", head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        print(a1);
        ReverseLinkedList linkedList = new ReverseLinkedList();
        ListNode listNode = linkedList.reverseList(a1);
        print(listNode);

    }
}
