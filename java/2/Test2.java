import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
    	for (int i = 0; i<4; i++) {
    		System.out.println ("ÊäÈëÊý×Ö£º");
       		Scanner in = new Scanner(System.in);
        	int x = in.nextInt();
        	byte a = (byte)x;
        	System.out.println ("byte:" + a);
        	short b = (short)x;
        	System.out.println ("short:" + b);
        	int c = (int)x;
       		System.out.println ("int:" + c);
        	long d = (long)x;
        	System.out.println ("long:" + d);
       	 	char e = (char)x;
        	System.out.println ("char:" + e);
        	System.out.println(Integer.toHexString(e));

		}

    }
}