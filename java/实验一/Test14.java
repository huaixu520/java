package Test14;
import java.util.*;

public class Test14 {
	public static void main(String[] args) {
		int[] Arr = {18,32,41,52,0,0,6,61,0,5,4,72,86,79,0,565,0};
		int ling = 0;
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]==0){
				ling++;
			}
		}
		int New[]=new int[Arr.length-ling];
		for(int i=0,j=0;i<Arr.length;i++) {
			if(Arr[i]!=0){
				New[j]=Arr[i];
				j++;
			}
		}
		System.out.println("原数组为：");
    	for(int j = 0; j < Arr.length; j++) {
        	System.out.print(Arr[j] + "\t");
    	}
		System.out.println();
		System.out.println("生成的新数组排序输出为：");
    	Arrays.sort(New);
    	for(int j = 0; j < New.length; j++) {
        	System.out.print(New[j] + "\t");
    	}
	}
}