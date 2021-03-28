package leetcode1230;
import java.util.*;

public class singleNumber {
	//数组中唯一一个只出现了一次的数字
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,1,2,2,5,5,5,2,100};
		System.out.println(f(arr1));
		
	}
	public static int f(int[] nums) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
        	if(hash.containsKey(nums[i])){
        		hash.put(nums[i],hash.get(nums[i])+1);
        	}
        	else{
        		hash.put(nums[i], 1);
        	}
        }
        for(int i=0; i<nums.length; i++){
            if(hash.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
        
    }
}
