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
		// TODO
		 return null;
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
		System.out.println(res.val);

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
