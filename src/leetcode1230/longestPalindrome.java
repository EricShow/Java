package leetcode1230;
import java.util.*;

public class longestPalindrome {
	//最长回文子串
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccbca";
		String ret = f(s);
		System.out.println(ret);
		System.out.print(ret.length());
	}
	public static String f(String s){
		int len = s.length();
        int max = 0;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[len][len];
        for(int j=1; j<len; j++){
            for(int i=0; i<j; i++){
                if(s.charAt(i)==s.charAt(j)&&(j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    if(max<j-i+1){
                        max = Math.max(max,j-i+1);
                        start = i;
                        end = j;
                    }
                    
                }
            }
        }
		return s.substring(start,end+1);
	}
}
