package leetcode1230;
import java.util.*;

public class ListNodeMOBAN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		Scanner in2 = new Scanner(line);
		//数组转链表
		ListNode l5 = new ListNode(0);
		ListNode cur3 = l5;
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++){
			l5.next = new ListNode(arr[i]);
			l5 = l5.next;
		}
		
		//链表1
		ListNode l4 = new ListNode(0);
		ListNode cur2 = l4;
		while(in2.hasNextInt()){
	     	l4.next = new ListNode(in2.nextInt());
	     	l4 = l4.next;
	 	}
		
		
		ListNode ret2 = mergeTwoLists(cur2.next,cur3.next);
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
