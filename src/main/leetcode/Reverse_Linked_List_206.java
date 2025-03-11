public class Reverse_Linked_List_206 {
	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		} else if (head.next == null) {
			return head;
		} else if (head.next.next == null) {
			ListNode curr = head.next;
			curr.next = head;
			head.next = null;
			head = curr;
		} else {
			ListNode c1 = null;
			ListNode c2 = head;
			ListNode c3 = head.next;
			while (c2 != null) {
				c2.next = c1;
				c1 = c2;
				c2 = c3;
				if (c3 != null) {
					c3 = c3.next;
				}
			}
			head = c1;
		}
		return head;
	}
}
