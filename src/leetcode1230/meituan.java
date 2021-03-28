package leetcode1230;
import java.util.*;

public class meituan {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,3,2},{3,0,3},{2,1,0}};
		int n = 3;
		int m = 7;
		System.out.println(f(n,m,arr));
	}
	public static int f(int n, int m, int[][] arr){
		if(n==1){
			return n;
		}
		if(n==2){
			return m%2==0?2:1;
		}
		int a = 1;
		int b = 2;
		int ret = 0;
		for(int i=2; i<=m; i++){
			ret = arr[a][b];
			a = b;
			b = ret;
		}
		return a;
	}

}
