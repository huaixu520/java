package Test21;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class Test21 {
    public static void main(String[] args) {
		int[] aa = new int[10];
		double average = 0.0;
		for (int i = 0; i<aa.length; i++) {
			double a = Math.random();
			aa[i] = (int)(a*900) + 100;
			average += aa[i];
			System.out.print(aa[i]+ "\t");
		}
		Arrays.sort(aa);
		String max = "���ֵ��" +aa[aa.length - 1];
		String min = "��Сֵ��" +aa[0];
		String ave = "ƽ��ֵ��" + average/aa.length;
		String all = max + "\n" + min + "\n" + ave;
		System.out.println ();
		System.out.println ( max);
		System.out.println ( min);
		System.out.println ( ave);
		try {
			File file = new File("data1.txt");
			if(!file.exists()){
       			file.createNewFile();
      		}
      		FileWriter fileWritter = new FileWriter(file.getName(),true);
      		fileWritter.write(all);
      		fileWritter.close();
		}	
		catch (Exception ex) {
			ex.printStackTrace();
		}
    }
}
