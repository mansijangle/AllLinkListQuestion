class solution {
   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // this is the first approach to solve this problem
        // ListNode l = new ListNode(-1);
        if(list2==null){
           return list1;
        }
        if(list1==null){
            return list2;
        }
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode mergelist = new ListNode(-1);
        ListNode tail = mergelist;
        while(current1 != null && current2 != null){
            if(current1.val==current2.val){
               tail.next = new ListNode(current1.val);
               tail = tail.next;

               tail.next = new ListNode(current2.val);
               tail = tail.next;

               current1 = current1.next;
               current2 = current2.next;

            }
            else  if(current1.val < current2.val){
               
                tail.next = new ListNode(current1.val);
                tail = tail.next;

               current1 = current1.next;
            }
            else{
                tail.next = new ListNode(current2.val);
                tail = tail.next;
                current2 = current2.next;
            }
        }
        // tail = tail.next;

        while(current1 != null){
            tail.next = new ListNode(current1.val);
            tail = tail.next;

            current1 = current1.next;
        }
        while(current2 != null){
            tail.next = new ListNode(current2.val);
            tail = tail.next;

            current2 = current2.next;
        }


        return mergelist = mergelist.next;

    }

}
