/* 382. Linked List Random Node
Solved
Medium
Topics
Companies
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Implement the Solution class:

Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.
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

/*
class Solution {
    List<Integer> l = new ArrayList<>();
    public Solution(ListNode head) {
        
        ListNode current = head;
        while(current!=null){
            l.add(current.val);
            current = current.next;
        }

    }
    
    public int getRandom() {
        double rand = Math.random()*l.size();
        return l.get((int)rand);

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */