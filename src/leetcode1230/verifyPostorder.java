package leetcode1230;
import java.util.*;
//�����������ĺ����������  ����33

public class verifyPostorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,8,6,12,16,14,10};
		System.out.println(f(a));
		
	}
	public static boolean f(int[] postorder){
		return recur(postorder, 0, postorder.length - 1);
	}
	public static boolean recur(int[] postorder, int i, int j){
		if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;  //���һ��Ԫ���Ǹ��ڵ㣬�ҵ���һ�����ڸ��ڵ��ֵ��������������������λ��,�����λ�ÿ�ʼ������������
        int m = p;
        while(postorder[p] > postorder[j]) p++;  //�ж������������ǲ������㶼���ڸ��ڵ㣬ֹͣ����:һֱ���ҵ�С�ڵ���postorder[j]Ϊֹ���ܻ��ҵ�����Ϊ�ܻ��е��ڵ�
        //���p!=j˵����������������ȫ�������ڸ��ڵ������
        //��������������Ϊ���������Ĺ���������С�ھ�++�ģ����ԣ��������жϣ�����˵�Ѿ��ж���
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
	}
}
