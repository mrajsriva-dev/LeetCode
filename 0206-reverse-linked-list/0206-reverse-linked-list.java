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
    public ListNode reverseList(ListNode head) {
        // Time complexity O(n) and Space complexity O(n) space is taking by call stack through recursion
        // if(head==null || head.next==null) {
        //     return head;
        // }
        // ListNode newHead = reverseList(head.next);
        // head.next.next = head; // interchanging the connection like 3->5 into 5->3
        // head.next = null;
        // return newHead;


         // Time complexity O(n) and Space complexity O(1) by through iterative way
         ListNode curr = head;
         ListNode prev = null;
         ListNode after = null;
         while(curr!=null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
         }
         return prev;
        
    }
}