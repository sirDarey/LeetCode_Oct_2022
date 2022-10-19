package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 14
 * Problem 2095: Delete the Middle Node of a Linked List
 */

class Day14_2095_DeleteTheMiddleNodeOfALinkedList {
    
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}    
    }
    
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;
        
        ListNode slow = head, 
                 fast = head.next.next;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow.next =  slow.next.next;
        return head;
    }
}