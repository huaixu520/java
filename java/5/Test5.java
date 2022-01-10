import java.util.*;
import java.io.*;

public class Test5 {
    public static void main(String[] args) {
    	try {
    		Scanner sc = new Scanner(new File("Test5.txt"));
    		while (sc.hasNextLine()) {
    			String s = sc.nextLine();
    			String aa[] = s.split("\\s+");
    			String newline = "";
    			for (String ss : aa){
    				String news = ss.substring(0,1).toUpperCase()+ss.substring(1);
    				newline = newline + news + " ";
    			}
    			System.out.println (newline);
    		}
    	}
		catch (Exception ex) {
			System.out.println ("error");
		}
	}
}
