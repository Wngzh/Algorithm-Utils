package utils;

import 链表.ListNode;

public class ListNodeUtils {
    public static ListNode buildByArray(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode insert = new ListNode(arr[i]);
            cur.next = insert;
            cur = cur.next;
        }
        return head;
    }

    public static void println(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode cur = node;
        while (cur != null && cur.next != null) {
            sb.append(cur.val).append(", ");
            cur = cur.next;
        }
        sb.append(cur.val).append("]");
        System.out.println(sb);
    }
}
