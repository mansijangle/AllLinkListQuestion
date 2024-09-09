
/* 23. Merge k Sorted Lists'
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.*/

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]


 
// Define a min-heap (Priority Queue)
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add the head of each list to the heap
        for (ListNode node : lists) {
            if (node != null) {
                heap.add(node);
            }
        }
        
        // Dummy node to build the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Process the heap until it's empty
        while (!heap.isEmpty()) {
            // Extract the minimum node from the heap
            ListNode minNode = heap.poll();
            current.next = minNode;
            current = current.next;
            
            // If there's a next node in the list, add it to the heap
            if (minNode.next != null) {
                heap.add(minNode.next);
            }
        }
        
        // Return the merged linked list, starting from the next of dummy node
        return dummy.next;