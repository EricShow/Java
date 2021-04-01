package leetcode1230;

public class isMonotonic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3};
		System.out.println(f(arr));
	}
	public static boolean f(int[] A) {
        int len = A.length;
        int countIncrease = 0, countDecrease = 0;
        for (int i = 0; i < len - 1; i++) {
            if (A[i] <= A[i + 1])
                countIncrease++;
            if (A[i] >= A[i + 1])
                countDecrease++;
        }
        return countIncrease == len - 1 || countDecrease == len - 1;
    }
}
