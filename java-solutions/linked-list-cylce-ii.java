/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        return detectCycleSet(head);
    }

    public ListNode detectCycleSet(ListNode head) {
        Set<ListNode> sett = new HashSet<>();

        while (head != null) {
            if (sett.contains(head)) return head;
            sett.add(head);
            head = head.next;
        }

        return null;
    }
}
