package leetcode1230;
import java.util.*;

public class numberK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(1);
		a.add(4);
		a.add(null);
		a.add(2);
		System.out.println(a);
	}
	public int kthLargest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<Integer>();
        midorder(root, res);
        int size = res.size();
        return res.get(size-k);
    }
    public void midorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        midorder(root.left, res);
        res.add(root.val);
        midorder(root.right, res);
    }

}
