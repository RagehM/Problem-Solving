import java.util.*;
public class Reorder_List_143 {
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode t = head;
        while(t != null){
            arr.add(t.val);
            t = t.next;
        }
        t= head;
        int c = 0;
        while(t != null){
            if(c == 0){
                t.val = arr.removeFirst();
                c=1;
            }
            else {
                t.val = arr.removeLast();
                c=0;
            }
            t=t.next;
        }
    }

    public static void main(String[] args) {

    }
}
