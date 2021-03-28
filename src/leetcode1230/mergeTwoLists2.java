package leetcode1230;
import java.util.*;

public class mergeTwoLists2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		Scanner in2 = new Scanner(line);
		//
		ListNode l4 = new ListNode(0);
		ListNode cur2 = l4;
		while(in2.hasNextInt()){
	     	l4.next = new ListNode(in2.nextInt());
	     	l4 = l4.next;
	 	}
		
		//给定长度输入int型数据到ListNode
		/*
		ListNode l3 = new ListNode(0);
		ListNode cur = l3;
		int len = 5;
		for(int i=0;i<len;i++){
			l3.next = new ListNode(in.nextInt());
			l3 = l3.next;
		}
		*/
		ListNode l1 = new ListNode(1);
		
		//手动next
		l1.next = new ListNode(5);
		l1.next.next = new ListNode(15);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		//ListNode ret = mergeTwoLists(l1,cur.next);
		
		System.out.println("l1和l3");
		//while(ret!=null){
		//	System.out.printf("%d  ",ret.val);
		//	ret = ret.next;
		//}
		
		ListNode ret2 = mergeTwoLists(l1,cur2.next);
		System.out.println("");
		System.out.println("l1和l4");
		while(ret2!=null){
			System.out.printf("%d  ",ret2.val);
			ret2 = ret2.next;
		}
	}
	public static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; ++i) {
            ans = mergeTwoLists(ans, lists[i]);
        }
        return ans;
    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b){
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }
	
}
