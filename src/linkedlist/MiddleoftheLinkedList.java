package linkedlist;



/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 * [Example 1]:
 *
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 *
 * Example 2:
 *
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleoftheLinkedList {


    /**
     * Success
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * @param head the listNode
     * @return middle node
     */
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode index1 = head; // one step etch loop
        ListNode index2 = head; // two step etch loop
        while (index2 != null && index2.next!= null) {
            if(index2.next.next != null){
                index2 = index2.next.next;
            }else{
                index2 = null;
            }
            index1 = index1.next;
        }
        return index1;
    }


    // test case in the sibling class 'LinkedListCycle'

}
