/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //Algorithm
    //traverse both the lists
    //compare elements of both the lists
    //if node1 > node2 merge into the list at exact place  
    //change the pointers accordingly
    //append all the remaining elements of the longer list 
        
      if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode pointer;
        if (l1.val <= l2.val) {
            pointer = l1;
            l1 = l1.next;
        } else {
            pointer = l2;
            l2 = l2.next;
        }
        ListNode pointerToHead;
        pointerToHead = pointer;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pointer.next = l1;
                l1 = l1.next;
            } else {
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }
       
        if (l1 != null) {
            pointer.next = l1;
        } else if (l2 != null) {
            pointer.next = l2;
        }
        return pointerToHead;
    }
}


