package leetcode1230;

public class lastRemaining {
	//圆圈型数组删除后，剩下的最后一个元素
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int m = 17;
		int ret = lastRemain(n,m);
		System.out.println(ret);
	}
	public static int lastRemain(int n, int m) {
        return f(n, m);
    }

    public static int f(int n, int m) {
        if (n == 1) {
            return 0;
        }
        int x = f(n - 1, m);
        return (m + x) % n;
    }
}
