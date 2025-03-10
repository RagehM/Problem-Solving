public class Delete_the_Middle_Node_of_a_Linked_List_2095 {
	public class ListNode {
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

	public static ListNode deleteMiddle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = null;
		if (head.next == null) {
			return null;
		}
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		return head;
	}

	public static void main(String[] args) {
		Delete_the_Middle_Node_of_a_Linked_List_2095 obj = new Delete_the_Middle_Node_of_a_Linked_List_2095();
		ListNode head = obj.new ListNode(1);
		head.next = obj.new ListNode(2);
		head.next.next = obj.new ListNode(3);
		head.next.next.next = obj.new ListNode(4);
		head.next.next.next.next = obj.new ListNode(5);
		head.next.next.next.next.next = obj.new ListNode(6);
		head.next.next.next.next.next.next = obj.new ListNode(7);
		head.next.next.next.next.next.next.next = obj.new ListNode(8);
		head.next.next.next.next.next.next.next.next = obj.new ListNode(9);
		head.next.next.next.next.next.next.next.next.next = obj.new ListNode(10);
		head = deleteMiddle(head);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
