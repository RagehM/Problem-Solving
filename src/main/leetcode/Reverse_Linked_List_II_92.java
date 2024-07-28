import java.util.Stack;

public class Reverse_Linked_List_II_92 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        int c = 1;
        ListNode t = head;
        while(t != null){
            if(c == left){
                ListNode t2 = t;
                while(c != (right + 1)){
                    stack.push(t2.val);
                    t2 = t2.next;
                    c++;
                }
                t2 = t;
                c = left;
                while(c != (right+1)){
                    t2.val = stack.pop();
                    t2 = t2.next;
                    c++;
                }
                break;
            }
            else{
                t = t.next;
                c++;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
