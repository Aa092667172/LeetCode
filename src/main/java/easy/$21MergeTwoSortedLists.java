package easy;

/**
 * You are given the heads of two sorted linked lists and .list1list2
 * 
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * @author linyukai
 *
 */

public class $21MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		return l2;
        
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode();
		ListNode n2 = new ListNode();

		new $21MergeTwoSortedLists().mergeTwoLists(null, null);
	}
	
	 
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
