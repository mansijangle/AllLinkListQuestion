 Odd Even Linked List
*/ Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity. */

 
class Solution {
    public ListNode oddEvenList(ListNode head) {
      if(head==null || head.next==null){
        return head;
      }
      ListNode OddLink = head;
      ListNode EvenLink = head.next;
      ListNode EvenHead = EvenLink;

      while(EvenLink!=null && EvenLink.next!=null){
            OddLink.next = OddLink.next.next;
            EvenLink.next = EvenLink.next.next;


            OddLink = OddLink.next;
            EvenLink = EvenLink.next;
      }

      OddLink.next = EvenHead;


      return head;
    }
}