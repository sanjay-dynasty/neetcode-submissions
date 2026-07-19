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

        Queue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val, b.val));
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for(ListNode node : lists){
            if(node != null){
                pq.add(node);
            }
        }
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            tail.next = temp;
            tail = tail.next;

            if(temp.next != null)
                pq.add(temp.next);
        }
        return dummy.next;

    }
}
