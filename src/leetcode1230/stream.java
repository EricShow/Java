package leetcode1230;
import java.util.*;
public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(s1.length());
		String s2 = "meituan";
		System.out.println(s2.length());
		int a = f(s1,s2);
		System.out.println(a);
	}
	public static int f(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		int i=0,j=0;
		int count = 0;
		while(i<len2){
			if(j==len1){
				j=0;
			}
			if(s2.charAt(i)==s1.charAt(j)){
				i++;
			}
			j++;
			count++;
		}
		return count-len2;
	}
}
