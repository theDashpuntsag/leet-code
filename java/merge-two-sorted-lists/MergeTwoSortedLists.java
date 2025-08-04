class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final ListNode result = new ListNode();
        ListNode head = result;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = new ListNode(list1.val);
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = new ListNode(list2.val);
                head = head.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            head.next = list2;
        } else {
            head.next = list1;
        }

        return result.next;
    }

}