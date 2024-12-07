package linkedlist;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Main {
	 public ListNode reverseList(ListNode head) {
	        ListNode cur=head,prev=null,next=null;

	        while(cur!=null){	
	            next=cur.next;
	            cur.next=prev;
	            prev=cur;
	            cur=next;
	        }
	        return prev;
	        
	    }
}
