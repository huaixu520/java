package Test12;
import java.util.*;

public class Test12 {
    public static void main(String[] args) {
    	System.out.println ("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        String s = Integer.toBinaryString(n);
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
        	if(a[i]=='1'){
              count++;
            }
        }
        System.out.println ("二进制表示有几个一");
        System.out.println(count);
    }
}