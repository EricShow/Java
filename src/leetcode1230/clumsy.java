package leetcode1230;
import java.util.*;

public class clumsy {
	//±¿½×³Ë    Á¦¿Û1006
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		System.out.println(f(N));
	}
	public static int f(int N){
		Stack<Integer> sta = new Stack<>();
        sta.push(N);
        int index=0;
        N--;
        while(N>0){
            if(index%4==0){
                sta.push(sta.pop()*N);
            }else if(index%4==1){
                sta.push(sta.pop()/N);
            }else if(index%4==2){
                sta.push(N);
            }
            else{
                sta.push(-N);
            }
            index++;
            N--;
        }
        int ret = 0;
        while(!sta.isEmpty()){
            ret += sta.pop();
        }
        return ret;
	}

}
