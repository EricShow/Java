package leetcode1230;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengzebiaoda {
	//正则化操作
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
	}
	public static void test01(String str1){
		String replace = str1.replace("123","ABC");
		System.out.println(replace);
	}
	public static void test02(String str){
		System.out.println(str.replaceAll("[0-9]", "A"));
		Pattern p = Pattern.compile("[0-9]");
		Matcher matcher = p.matcher(str);
		System.out.println(matcher.replaceAll("Z"));
	}

}
