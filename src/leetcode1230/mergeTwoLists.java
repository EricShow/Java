package leetcode1230;
import java.util.*;

public class mergeTwoLists {
	//合并两个排序子链表
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode ret = f(l1,l2);
		while(ret!=null){
			System.out.printf("%d  ",ret.val);
			ret = ret.next;
		}
		
		
	}
	public static ListNode f(ListNode l1, ListNode l2) {
        // write code here
        int len1 = getLength(l1);
        int len2 = getLength(l2);
        if(len1 == 0){
            return l2;
        }
        if(len2 == 0){
            return l1;
        }
        int[] arr = new int[len1+len2];
        for(int i=0; i<len1; i++){
            arr[i] = l1.val;
            l1 = l1.next;
        }
        for(int i=len1; i<len1+len2; i++){
            arr[i] = l2.val;
            l2 = l2.next;
        }
        Arrays.sort(arr);
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for(int i=1; i<len1+len2; i++){
            ListNode ans = new ListNode(arr[i]);
            head.next = ans;
            head = head.next;            
        }
        return cur;
    }
    public static int getLength(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
	
}
