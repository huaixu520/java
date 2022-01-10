import java.util.*;
import java.io.*;

public class Test7 {

    public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(new File("Test.txt"));
        	System.out.println ("	学号 		  姓名		 数学成绩	  英语成绩	 计算机成绩 	  总成绩	 平均成绩");
        	while(sc.hasNextLine()){
        		String line = sc.nextLine().trim();
        		student st = new student();
        		String[] aa = line.split("\\s+");
        		st.id = aa[0];
        		st.name = aa[1];
        		st.y = Integer.parseInt(aa[2]);
        		st.s = Integer.parseInt(aa[3]);
        		st.j = Integer.parseInt(aa[4]);
        		st.display();	
        	}	
        }
        catch (Exception ex) {
        	System.out.println ("error");
        }
    }
}

class student{
	String id ,name;
	int y,s,j;
	public int sum(){
		return y+s+j;
	}
	public int average(){
		double a = (y+s+j)/3.0;
		return (int)a;
	}
	public void display(){

		String disp = id + "\t\t" +name+ "\t\t\t" +y+ "\t\t\t" +s+ "\t\t\t" +j + "\t\t\t" +sum() + "\t\t\t" +average();
		System.out.println (disp);
	}
}
