package leetcode1230;

public class translateNum {
	//将数字翻译成字符串，一共能翻译多少种
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(f(n));
	}
	public static int f(int num){
		if(num>=0&&num<=9){
			return 1;
		}
		return (num%100>=10)&&(num%100<=25)?f(num/10)+f(num/100):f(num/10);
	}
}
