package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 13
 * Problem 237: Delete Node in a Linked List
 */

class Day13_237_DeleteNodeInALinkedList {
    
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }    
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}