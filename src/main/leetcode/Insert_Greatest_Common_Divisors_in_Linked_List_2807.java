public class Insert_Greatest_Common_Divisors_in_Linked_List_2807 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        if(a == 0) return b;
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode t1;
        ListNode t = head;
        while(t.next != null){
            int a = t.val;
            int b = t.next.val;
            int gcd = gcd(a, b);
            ListNode temp = new ListNode(gcd);
            t1 = t.next;
            t.next = temp;
            temp.next = t1;
            t = t.next.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
