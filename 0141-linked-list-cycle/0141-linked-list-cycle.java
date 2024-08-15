/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         //slow moves 1 step at a time
         //fast move 2 step at a time
         //if both meet at a same time then there is a cycle
         
          ListNode slow = head , fast = head;
          while(fast !=  null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            
          }

        }
        return false;
        
    }
}