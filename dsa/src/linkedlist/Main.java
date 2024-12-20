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
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode cur = temp;

        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
               cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }

        if(list1==null){
           cur.next=list2;
        }
         if(list2==null){
           cur.next=list1;
        }

        return temp.next;
    }
}