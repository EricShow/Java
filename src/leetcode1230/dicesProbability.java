package leetcode1230;
import java.util.*;
//掷骰子，计算总和的概率   n个骰子的点数
public class dicesProbability {
	public static void main(String[] args){
		int n = 2;
		double[] ans = f(n);
		for(int i=0; i<ans.length; i++){
			System.out.println(f(2)[i]);
		}
	}
	public static double[] f(int n){
		double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);
        for (int i = 2; i <= n; i++) {
            double[] tmp = new double[5 * i + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    tmp[j + k] += dp[j] / 6.0;
                }
            }
            dp = tmp;
        }
        return dp;
	}
}
