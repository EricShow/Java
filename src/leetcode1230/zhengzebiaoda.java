package leetcode1230;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengzebiaoda {
	//���򻯲���
	//https://blog.csdn.net/qq_18298439/article/details/88974940?ops_
	//request_misc=%257B%2522request%255Fid%2522%253A%252216169024161
	//6780264011349%2522%252C%2522scm%2522%253A%252220140713.13010233
	//4..%2522%257D&request_id=161690241616780264011349&biz_id=0&utm_
	//medium=distribute.pc_search_result.none-task-blog-2~all~top_cli
	//ck~default-2-88974940.pc_search_result_before_js&utm_term=Java%
	0//E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F
	/*
	 * ���Դ�һ���ַ����У���ȡ����������Ҫ�ĵ�ȫ������
	 * 
	 * ʵ�ֲ��裺
	 * 	1��ʹ��Pattern��ľ�̬����compile,������������Ԥ����
	 * 	static Pattern compile(�������)
	 *  �������ص�ʱPattern��Ķ���
	 *  2��ʹ��Pattern��ķǾ�̬����matcher,���������Ͳ��ҵ��ַ�������ƥ��
	 *  Matcher matcher(�ַ�����Ҫ���ҵ��Ǹ��ַ���)
	 *  ���ص�ʱMatcher��Ķ���
	 *  3��ʹ��Matcher��ķ���find()���ҷ��Ϲ�����ַ���������ҵ�����True
	 *  4��ʹ��Matcher��ķ���group() ��ȡ���ҵ�������
	 * */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "123";
		test01(str1);
		String str2 = "123asd13ad2asd3asd";
		test02(str2);
		// TODO Auto-generated method stub
		String str = "�ɶ���(�ɻ���)(�����)(������)";
		Pattern p = Pattern.compile(".*?(?=\\()");
		Matcher m = p.matcher(str);
		if(m.find()){
			System.out.println(m.group());
		}
		while(m.find()){
			System.out.println(m.group());
		}
		
		//��ʽ��
		String str3 = "how do you do but i am a student";
		Pattern p1 = Pattern.compile("\\b[a-zA-Z]{3}\\b");
		Matcher m2 = p1.matcher(str3);
		while(m2.find()){
			System.out.println(m2.group());
		}
		
		
	}
	public static void test01(String str1){
		String replace = str1.replace("123","ABC");
		System.out.println(replace);
	}
	public static void test02(String str){
		System.out.println(str.replaceAll("[0-9]", "A"));
		Pattern p = Pattern.compile("[0-9]");   //�ȱ��룬������
		Matcher matcher = p.matcher(str);
		System.out.println(matcher.replaceAll("Z"));
	}

}
