/* Given a linked list of n nodes and a key , the task is to check if the key is present in the linked list or not.

Example:

Input:
n = 4
1->2->3->4
Key = 3
Output:
True
Explanation:
3 is present in Linked List, so the function returns true. 


Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/


class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    }
}