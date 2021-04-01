package leetcode1230;
import java.util.*;

public class shijian{

    /**
     * 取得当前时间戳（精确到秒）
     *
     * @return nowTimeStamp
     */

    public static void main(String atgs[]) {
        System.out.println(getNowTimeStamp());
        System.out.println(TimeStamp2Date("1252639886", "yyyy-MM-dd HH:mm:ss"));
    }
    public static Long getNowTimeStamp() {
        long time = System.currentTimeMillis();
        return time / 1000;
    }
    public static String TimeStamp2Date(String timestampString, String formats){  
    	Long timestamp = Long.parseLong(timestampString)*1000;  
    	String date = new java.text.SimpleDateFormat(formats).format(new java.util.Date(timestamp));  
    	return date;  
    }
}
