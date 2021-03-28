package leetcode1230;
import java.util.*;

public class singleNumbers {
	public static void main(String[] args){
		int[] arr = {1,2,3,3,2,5};
		for(int i=0; i<f(arr).length; i++){
			System.out.println(f(arr)[i]);
		}
	}
	public static int[] f(int[] nums){
		
		int[] ans = new int[2];
        if(nums.length==0){
            return ans;
        }
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
            }else{
                hash.put(nums[i],1);
            }
        }
        
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(hash.get(nums[i])==1){
                ans[j]=nums[i];
                j++;
            }
            if(j>=2){
                break;
            }
        }
		return ans;
	}
}
