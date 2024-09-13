/*206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list./*

 
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
        // Stack<Integer> s = new Stack<Integer>();
        // ListNode reverse = new ListNode(0);
        // ListNode dummyR =reverse;
        if(head==null || head.next==null){
            return head;
        }

        // ListNode temp = head;
        // while(temp!=null){
        //     s.push(temp.val);
        //     temp = temp.next;
        // }
        
        // while(!s.isEmpty()){
        //    dummyR.next = new ListNode(s.pop());
        //    dummyR = dummyR.next;
        // }

        // return reverse.next;
        // this is the secondapproach 
        // ListNode temp = head;
        // ListNode prev = null;
        // while(temp!=null){
        //     ListNode front = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = front;
        // }

        // return prev;

        // recursion to solve this problem;
        ListNode newnode = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newnode;




    }
}