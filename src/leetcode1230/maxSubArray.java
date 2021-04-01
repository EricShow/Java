package leetcode1230;

public class maxSubArray {
	public static void  main(String[] args){
		int[] nums = {-1,2,-3,4,5,6,7,-100};
		System.out.println(f(nums));
	}
	public static int f(int[] nums) {
        int max = nums[0];
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(ans>0){
                ans = ans + nums[i];
            }else{
                ans = nums[i];
            }
            max = Math.max(ans,max);
        }
        return max;
    }
}
