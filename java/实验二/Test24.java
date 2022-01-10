package Test24;
import java.util.*; 
import java.io.File;
import java.io.FileWriter;

public class Test24
{
	public static void main(String[] args) 
	{
		System.out.print("请输入一个整数n：");
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
    	for (int i = 1; i < n+1; i++) 
    	{
    		if(i % 3 == 0 && i % 5 == 0)
        	{
        		String s1 = "\"" + "FizzBuzz" + "\"" + "\n";
            	System.out.print(s1);
            	save(s1);
        	}else if(i % 3 == 0)
        	{
        		String s1 = "\"" + "Fizz" + "\"" + "\n";
            	System.out.print(s1);
            	save(s1);
        	}else if(i % 5 == 0)
        	{
        		String s1 = "\"" + "Buzz" + "\"" + "\n";
            	System.out.print(s1);
            	save(s1);
        	}else
        	{
        		String s1 ="\"" + i + "\"" + "\n";
        		System.out.print(s1);
        		save(s1);
        	}
		}
	}
	public static void save(String ss)
	{
		try {
			File file = new File("data4.txt");
			if(!file.exists()){
       			file.createNewFile();
      		}
      		FileWriter fileWritter = new FileWriter(file.getName(),true);
      		fileWritter.write(ss);
      		fileWritter.close();
			}	
			catch (Exception ex) {
				ex.printStackTrace();
			}
	}
}