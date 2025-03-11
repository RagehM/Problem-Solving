public class Odd_Even_Linked_List_328 {
	public static ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode odd = head;
		ListNode even = head.next;
		ListNode temp = even;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			odd = odd.next;
			even.next = even.next.next;
			even = even.next;
		}
		odd.next = temp;
		return head;
	}
}
