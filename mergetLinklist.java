/* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
*/
 

/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode l = new ListNode(-1);
        if(list2==null){
           return list1;
        }
        if(list1==null){
            return list2;
        }
        int arr[] = new int[getlength(list1) + getlength(list2)];
        int x = 0;
        while(list1!=null){
           arr[x++] = list1.val;
           list1 = list1.next;
        }

        while(list2!=null){
            arr[x++] = list2.val;
            list2 = list2.next;
        }
        
        Arrays.sort(arr);

        ListNode newnode = new ListNode(arr[0]);
        ListNode current = newnode;
        for(int i=1; i<arr.length; i++){
                current.next = new ListNode(arr[i]);
                current = current.next;
        }        

        return newnode;

    }

    public int getlength(ListNode l1){
            ListNode l = l1;
            int len=0;
            while(l!=null){
                len++;
                l = l.next;
            }
            return len;
    }
}