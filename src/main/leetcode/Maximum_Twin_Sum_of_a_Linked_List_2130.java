public class Maximum_Twin_Sum_of_a_Linked_List_2130 {
	public static int pairSum(ListNode head) {
		if (head.next.next == null) {
			return head.val + head.next.val;
		} else {
			ListNode fast = head;
			ListNode slow = head;
			ListNode prev = null;
			while (fast != null && fast.next != null) {
				prev = slow;
				slow = slow.next;
				fast = fast.next.next;
			}
			ListNode c1 = null;
			ListNode c2 = prev.next;
			ListNode c3 = prev.next.next;
			prev.next = null;
			while (c2 != null) {
				c2.next = c1;
				c1 = c2;
				c2 = c3;
				if (c3 != null) {
					c3 = c3.next;
				}
			}
			int max = Integer.MIN_VALUE;
			c2 = head;
			while (c2 != null) {
				int sum = c2.val + c1.val;
				c2 = c2.next;
				c1 = c1.next;
				max = Math.max(max, sum);
			}
			return max;
		}
	}
}
