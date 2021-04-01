package leetcode1230;
import java.util.*;

public class minNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] num = {10,2};
		String s = f(num);
		System.out.println(s);
	}
	public static String f(int[] nums) {
	    String[] strs = new String[nums.length];
	    for(int i = 0; i < nums.length; i++)
	        strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
	}
}
