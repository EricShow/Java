package leetcode1230;
import java.util.*;
public class set {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=6;
		int m=8;
		int[] arr1 = {1,1,4,5,1,4};
		int[] arr2 = {3,0,4,0,3,0};
		int x = minX(arr1,arr2,n,m);
		System.out.println(x);
	}
	public static int minX(int[] a, int[] b, int n, int m) {
		Arrays.sort(a);
		Arrays.sort(b);
		int x = 0;
		while(true){
			int i=0;
			while(i<n){
				int ans = (a[i] + x)%m;
				if(ans!=b[i]){
					break;
				}
				i++;
			}
			if(i==n) break;
			x++;
		}
		return x;
	}
}
