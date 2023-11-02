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
    public boolean hasCycle(ListNode head) {
        //return hashCycle(head);
        return rabbitTurtle(head);
    }

    public boolean hashCycle(ListNode head) {
        Set<ListNode> visitedSet = new HashSet<>();

        while (head != null) {
            if (visitedSet.contains(head)) return true;
            visitedSet.add(head);
            head = head.next;
        }

        return false;
    }

    public boolean rabbitTurtle(ListNode head) {
        ListNode turtle = head;
        ListNode rabbit = head;

        while (turtle != null && rabbit != null) {
            // if (rabbit.next == null || rabbit.next.next == null) return false;
            // if (turtle.next == null) return false;
            try {
                turtle = turtle.next;
                rabbit = rabbit.next.next;
            } catch (NullPointerException e) {
                return false;
            }
            if (turtle == rabbit) return true;
        }

        return false;
    }
}
