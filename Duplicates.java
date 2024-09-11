/*
Remove Duplicates from Sorted List II
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while(current!=null){
           Boolean hasduplicate = false;

           while(current.next!=null && current.val == current.next.val){
            hasduplicate = true;
            current = current.next;
           }

           if(hasduplicate){
            prev.next = current.next;
           }else{
            prev = prev.next;
           }
           current = current.next;
        }


        return dummy.next;
    }
}