import java.util.*;


public class Test1 {
    public static void main(String[] args) {
	int[] aa = new int[10];
	double average = 0.0;
	for (int i = 0; i<aa.length; i++) {
		double a = Math.random();
		aa[i] = (int)(a*900) + 100;
		average += aa[i];
		System.out.println (aa[i]);
		}
Arrays.sort(aa);
System.out.println ("���ֵ��" + aa[aa.length - 1]);
System.out.println ("��Сֵ��" + aa[0]);
System.out.println ("ƽ��ֵ��" + average/aa.length);
    }
}
