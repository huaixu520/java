package Test13;
import java.util.*;

public class Test13 {
    public static void main(String[] args) {
    	int length = 0;
		int numbers[] = new int[20];
    	Scanner in = new Scanner(System.in);
    	System.out.println ("输入元素个数：");
    	length = in.nextInt();
    	System.out.println ("输入元素：");
    	for (int i = 0; i<length; i++) {
    		numbers[i] = in.nextInt();
		}
		System.out.println ("数组中只出现一次的数字为");
		System.out.println (Find(numbers));
	}
	public static Integer Find(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			int count = 1;
			for(int j = 0; j < numbers.length; j++) {
				if(i == j)
					continue;
				if(numbers[i] == numbers[j])
					count++;
			}
			if(count == 1)
				return numbers[i];
		}
		return null;
	}
}