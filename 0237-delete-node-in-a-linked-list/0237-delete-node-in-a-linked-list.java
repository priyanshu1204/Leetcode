/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
 node.val = node.next.val;      // Step 1: Copy next node's data
        node.next = node.next.next; // Step 2: Skip the next node
        
    }
}