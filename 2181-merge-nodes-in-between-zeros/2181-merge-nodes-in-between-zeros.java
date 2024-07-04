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
    public ListNode mergeNodes(ListNode head) {
//         ListNode p1 = head.next;
//         ListNode p2 = p1;
        
//         int sum = 0;
//         while(p2!=null){
//             while(p2!= null && p2.val != 0){
//                 sum += p2.val;
//                 p2 = p2.next;
//             }
            
//             p1.val = sum;
//             p2 = p2.next;
//             p1.next = p2;
//             p1= p1.next;
//             sum = 0;
            
//         }
//         return head.next;
        
        
        
//         solution using recursion
        
        head = head.next;
        if(head == null){
            return head;
        }
        ListNode temp = head;
        
        int sum = 0;
        while(temp != null && temp.val != 0){
            sum += temp.val;
            temp = temp.next;
        }
        
        head.val = sum;
        head.next = mergeNodes(temp);
        
        return head;
    }
}