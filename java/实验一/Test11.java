package Test11;
import java.util.*;


public class Test11 {

	public static void main (String[] args) {
		int length = 0;
		int numbers[] = new int[20];
		int duplication[] = new int[20];
		Test11 t = new Test11();
    	Scanner in = new Scanner(System.in);
    	System.out.println ("����Ԫ�ظ�����");
    	length = in.nextInt();
    	System.out.println ("����Ԫ�أ�");
    	for (int i = 0; i<length; i++) {
    		numbers[i] = in.nextInt();
		}
        Set<Integer> set = new HashSet<>();
        for(int i =0 ;i<length;i++){
            if(set.contains(numbers[i])){
                duplication[0] = numbers[i]; 
                System.out.println ("��һ���ظ�������:");
                System.out.println (duplication[0]);
                break;
            }
            else{
                set.add(numbers[i]);
            }
            
        }
        
    }
}
