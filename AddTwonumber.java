You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode t1 = l1;
     ListNode t2 = l2;
     ListNode dummy = new ListNode(-1);
     ListNode current = dummy;
     int carry = 0;
     while(t1 != null || t2 !=null){       
        int sum = carry;

        if(t1!=null){
            sum += t1.val;
            t1 = t1.next;
        }
        if(t2!=null){
            sum += t2.val;
            t2 = t2.next;
        }

        ListNode newnode = new ListNode(sum%10);
        carry = sum/10;
       
        current.next = newnode;
        current = current.next;
 
     }

    if(carry >0){
      ListNode l = new ListNode(carry);
      current.next = l;
      current = current.next;
    }

return dummy.next;
    }
}