package Test12;
import java.util.*;

public class Test12 {
    public static void main(String[] args) {
    	System.out.println ("������һ������:");
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
        System.out.println ("�����Ʊ�ʾ�м���һ");
        System.out.println(count);
    }
}