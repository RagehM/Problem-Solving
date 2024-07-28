public class Merge_In_Between_Linked_Lists_1669 {
    public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t = list1;
        int c = 0;
        while (t != null) {
            if((c + 1) == a){
                ListNode t2 = t;
                while(c++ !=b){
                    t2 = t2.next;
                }
                ListNode temp =  list2;
                t.next = list2;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = t2.next;
                break;
            }
            else{
                t = t.next;
                c++;
            }
        }
        return list1;
    }

    public static void main(String[] args) {

    }
}
