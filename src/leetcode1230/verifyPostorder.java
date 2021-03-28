package leetcode1230;
import java.util.*;
//二叉搜索树的后序遍历序列  力扣33

public class verifyPostorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,8,6,12,16,14,10};
		System.out.println(f(a));
		
	}
	public static boolean f(int[] postorder){
		return recur(postorder, 0, postorder.length - 1);
	}
	public static boolean recur(int[] postorder, int i, int j){
		if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;  //最后一个元素是根节点，找到第一个大于根节点的值，就是区分左右子树的位置,从这个位置开始，就是右子树
        int m = p;
        while(postorder[p] > postorder[j]) p++;  //判断右子树部分是不是满足都大于根节点，停止条件:一直到找到小于等于postorder[j]为止，总会找到，因为总会有等于的
        //如果p!=j说明右子树不能满足全部都大于根节点的条件
        //至于左子树，因为我们搜索的过程是满足小于就++的，所以，左子树判断，或者说已经判断了
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
	}
}
