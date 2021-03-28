package leetcode1230;
import java.util.*;

public class twoSum {
	//数组中和为target的两个数
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] ret = f(nums,target);
		for(int i=0; i<ret.length; i++){
			System.out.println(ret[i]);
		}
	}
	public static int[] f(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(target-nums[i])){
                if(nums[i]==(target-nums[i])){
                    if(hash.get(nums[i])>1){
                        return new int[] {nums[i],target-nums[i]};
                    }
                    else{
                        return null;
                    }
                }
                return new int[] {nums[i],target-nums[i]};
            }
        }
        return null;
    }
}
