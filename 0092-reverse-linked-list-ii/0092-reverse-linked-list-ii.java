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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode prev = dummy;
        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }
        
        int noOfNode = right - left;
        ListNode curr = prev.next;
        
        for(int i=0;i<noOfNode;i++){
            ListNode temp = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = temp;
        }
        
        return dummy.next;
    }
}