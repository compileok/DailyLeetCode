package linkedlist;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 */
public class LinkedListCycle {

    /**
     * Success
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
     * @param head the linkedlist
     * @return if cycle exists
     */
    public static boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        if(head.next == null) {
            return false;
        }
        boolean res = false;
        ListNode index1 = head;
        ListNode index2 = head;
        while(index1.next != null && index2.next!=null){
            if(index2.next.next!=null){
                index2 = index2.next.next;
                if(index2.val == index1.val) {
                    res = true;
                    break;
                }
            }
            index1 = index1.next;
        }
        return res;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(hasCycle(node1));


    }
}

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
      val = x;
      next = null;
  }
}