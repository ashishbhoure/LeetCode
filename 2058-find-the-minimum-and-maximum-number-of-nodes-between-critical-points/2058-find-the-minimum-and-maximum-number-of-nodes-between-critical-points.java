/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
       if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        int i = 1;
        int prevCriticalPos = -1;
        int firstCriticalPos = -1;
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        while (next != null) {
            if ((prev.val > curr.val && curr.val < next.val) || 
                (prev.val < curr.val && curr.val > next.val)) {
                
                if (prevCriticalPos != -1) {
                    minDistance = Math.min(minDistance, i - prevCriticalPos);
                } else {
                    firstCriticalPos = i;
                }
                prevCriticalPos = i;
            }
            
            i++;
            prev = curr;
            curr = next;
            next = next.next;
        }

        if (prevCriticalPos == firstCriticalPos || firstCriticalPos == -1) {
            return new int[]{-1, -1};
        }
        
        maxDistance = prevCriticalPos - firstCriticalPos;
        return new int[]{minDistance, maxDistance};
        
    }
}