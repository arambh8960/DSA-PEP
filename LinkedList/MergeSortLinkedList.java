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
class Solution {
    public ListNode getMiddle(ListNode head){
        //slow  and fast pointer approach to find the middle;
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;

        }
         while(l1!=null){
        tail.next=l1;
        l1=l1.next;
        tail=tail.next;
    }

    while(l2!=null){
        tail.next=l2;
        l2=l2.next;
        tail=tail.next;
    }

        return dummy.next;

    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=getMiddle(head);
        ListNode left=head;
        ListNode right=mid.next;
        //disconnecting the left half and right half
        mid.next=null;
        ListNode sortedLeft=sortList(left);
        ListNode sortedright=sortList(right);

        return merge(sortedLeft,sortedright);
        

    }
}