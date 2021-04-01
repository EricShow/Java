package leetcode1230;

public class checkPalindromeFormation {
	//СІПл1616
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abdef";
		String b = "ghijk";
		System.out.println(checkstr(a,b));
	}
	private static boolean checkstr(String a,String b){
        char[] stra = a.toCharArray();
        char[] strb = b.toCharArray();
        int left = 0;
        while(stra[left]==strb[stra.length-left-1]){
        	left++;
        }
        if(left>=stra.length/2){   
        	return true;
        }
        if(isPa(a.substring(left,stra.length-left))||isPa(b.substring(left,stra.length-left)))
        	return true;
        
        return false;
    }

	public static boolean isPa(String s){
		char[] str = s.toCharArray();0
]		for(int i=0; i<str.length/2; i++){
			if(str[i]!=str[str.length-i-1])
				return false;
		}
		return true;
	}

}
