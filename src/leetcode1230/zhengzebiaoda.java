package leetcode1230;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengzebiaoda {
	//正则化操作
	//https://blog.csdn.net/qq_18298439/article/details/88974940?ops_
	//request_misc=%257B%2522request%255Fid%2522%253A%252216169024161
	//6780264011349%2522%252C%2522scm%2522%253A%252220140713.13010233
	//4..%2522%257D&request_id=161690241616780264011349&biz_id=0&utm_
	//medium=distribute.pc_search_result.none-task-blog-2~all~top_cli
	//ck~default-2-88974940.pc_search_result_before_js&utm_term=Java%
	0//E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F
	/*
	 * 可以从一个字符串中，获取出我们所需要的的全部内容
	 * 
	 * 实现步骤：
	 * 	1、使用Pattern类的静态方法compile,将正则规则进行预编译
	 * 	static Pattern compile(正则规则)
	 *  方法返回的时Pattern类的对象
	 *  2、使用Pattern类的非静态方法matcher,将正则规则和查找的字符串进行匹配
	 *  Matcher matcher(字符串你要查找的那个字符串)
	 *  返回的时Matcher类的对象
	 *  3、使用Matcher类的方法find()查找符合规则的字符串，如果找到返回True
	 *  4、使用Matcher类的方法group() 获取查找到的内容
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
		String str = "成都市(成华区)(武侯区)(高新区)";
		Pattern p = Pattern.compile(".*?(?=\\()");
		Matcher m = p.matcher(str);
		if(m.find()){
			System.out.println(m.group());
		}
		while(m.find()){
			System.out.println(m.group());
		}
		
		//格式：
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
		Pattern p = Pattern.compile("[0-9]");   //先编译，在运用
		Matcher matcher = p.matcher(str);
		System.out.println(matcher.replaceAll("Z"));
	}

}
