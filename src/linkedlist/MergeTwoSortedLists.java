package linkedlist;


/**
 * Example:
 * 	Input: 1->2->4, 1->3->4
 * 	Output: 1->1->2->3->4->4
 * @author xudeming
 * @date 2019/3/21
 */
public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode tempNode = head;
		while(true){
			if(l1 == null && l2 == null){
				break;
			}
			if((l2 != null) && (l1 == null || l1.val > l2.val)){
				tempNode.next = l2;
				tempNode = l2;
				l2 = l2.next;
			}else{
				tempNode.next = l1;
				tempNode = l1;
				l1 = l1.next;
			}
		}
		return head.next;
	}
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public static void main(String[] args) {

		MergeTwoSortedLists merge = new MergeTwoSortedLists();
		ListNode l1 = merge.createNode(new int[]{1,2,4});
		ListNode l2 = merge.createNode(new int[]{1,3,4});
		ListNode res = merge.mergeTwoLists(l1,l2);

		System.out.println(res.next.next.next.val == 3);

	}
	private  ListNode createNode(int[] datas){
		if(datas == null) {
			return null;
		}
		ListNode index = new ListNode(0);
		ListNode head = new ListNode(0);
		for (int i = 0; i < datas.length; i++) {
			ListNode node= new ListNode(datas[i]);
			if(i == 0) {
				index.next = node;
				head.next = node;
			}else {
				index.next.next = node;
				index.next = node;
			}
		}
		return head.next;
	}

	private void printNode(ListNode head){
//		while(head != null)
	}
}
