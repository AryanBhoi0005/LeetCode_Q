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
    public ListNode midNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseNode(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;  // Base case to handle edge cases
        }

        // Finding the middle of the list
        ListNode mid = midNode(head);

        // Reversing the second half
        ListNode rightHead = reverseNode(mid.next);

        // Splitting the list into two halves
        mid.next = null;

        // Merging the two halves
        ListNode first = head;
        ListNode second = rightHead;

        while (second != null) {
            ListNode temp1 = first.next;  // Highlight: Temporarily store the next node of 'first'
            ListNode temp2 = second.next;  // Highlight: Temporarily store the next node of 'second'

            first.next = second;  // Link 'first' to 'second'
            second.next = temp1;  // Link 'second' to 'temp1'

            first = temp1;  // Move 'first' pointer forward
            second = temp2;  // Move 'second' pointer forward;
    }
}
}