package leetcode1230;
import java.util.*;

//二叉搜索树的前序遍历序列
public class verifyPreorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,6,5};
		int[] b = {5,2,1,3,6};
		int[] c = {5,2,10,3,6};
		System.out.println(f(a));
		System.out.println(f(b));
		System.out.println(f(c));
	}
	public static boolean f(int[] preorder){
		return recur(preorder,0,preorder.length-1);
	}
	public static boolean recur(int[] preorder, int i, int j){
		if(j<=i) return true;
        int p = j;
        while(preorder[p] > preorder[i]) p--;
        int m = p;
        while(preorder[p] < preorder[i]) p--;
        return p == i && recur(preorder, i+1, m) && recur(preorder, m+1, j);
	}
}
