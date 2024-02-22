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
    
    static ListNode FindMid(ListNode head){//Rabbit and horse algo for finding Middle 
     ListNode s = head;
     ListNode f = head.next;
     while(f!=null && f.next!=null){
    s = s.next;
    f = f.next.next;
     }
     return s;
    }
   static ListNode merge(ListNode L, ListNode R){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(L!=null && R!=null){
            if(L.val<R.val){
                temp.next = L;
                temp = L;
                L = L.next;
            }else{
                temp.next = R;
                temp = R;
                R = R.next;
            }
        }
        if(L!=null)temp.next = L;
        else temp.next = R;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode mid = FindMid(head);
        ListNode R = mid.next;
        mid.next = null;
        ListNode L = head;
        L = sortList(L);
        R = sortList(R);
        return merge(L,R);
    }
}