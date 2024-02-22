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
        ListNode slow = head;
        ListNode fast  = head;
        while(fast!=null && fast.next!=null){
            int count = 0;
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
               
                slow=head;
                while(slow!=fast){
                    count++;
                    slow=slow.next;
                    fast=fast.next;
                }
                
                 System.out.print("tail connects to node index "+count);
                 return slow;
            }
        }
        System.out.print("no cycle");
        return null;
    }
}