/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode num1 = l1;
        ListNode num2 = l2;
        ListNode ans = new ListNode(0);
        ListNode result = ans;
        while(num1!=null || num2!=null){
            int x = (num1 != null) ? num1.val : 0;
            int y = (num2 != null) ? num2.val : 0;
            int sum = carry + x + y;
            sum = x + y + carry;
            carry = sum/10;
            result.next = new ListNode(sum%10);
            result = result.next;
            if(num1!=null) num1=num1.next;
            if(num2!=null) num2=num2.next;
        }
        if(carry>0){
            result.next = new ListNode(carry);
        }
        return ans.next;
    }
}