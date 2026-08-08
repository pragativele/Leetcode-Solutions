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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> Integer.compare(a.val , b.val));
        for(ListNode n : lists){
            if(n != null){
                q.add(n);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!q.isEmpty()){
            ListNode newl = q.poll();
            curr.next = newl;
            curr = curr.next;
            if(newl.next != null){
                q.add(newl.next);
            }
        }
        return dummy.next;
    }
}