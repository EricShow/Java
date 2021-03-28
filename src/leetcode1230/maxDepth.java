package leetcode1230;
import java.util.*;

public class maxDepth {
	//最大深度
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		//int[] b=new int[5];
		Integer[] data = {5,4,8,11,null,13,4,7,2,null,null,null,11,1,1,1};
		//for(int i=0;i<b.length;i++){
		//	b[i]=in.nextInt();
		//}
		TreeNode ans = createBinaryTreeByArray(data,0);
		int depth = f(ans);
		System.out.println(depth);
	}
	public static TreeNode createBinaryTreeByArray(Integer[] array,int index){
		TreeNode tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
	}
	public static int f(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(f(root.left),f(root.right))+1;
    }
}
