package cn.edu.ctbu.jsj;
import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Test9 {
	int[] num = new int[26];
	int sum = 0;
	int words = 0,lines = 0;
	NumberFormat numberFormat = NumberFormat.getInstance();  
	public void display(){
		try {
    		FileWriter fw = new FileWriter("result.txt");
    		fw.write("单词数:" + words + "\r\n");
    		fw.write("行数:" + lines + "\r\n");
    		for(int i = 0;i<26;i++){
    			sum+=num[i];
    		}
    		for(int i = 0;i<26;i++){
    			String s = numberFormat.format((double)num[i]/(double)sum * 100);
    			fw.write((char)(i+97) + "百分比：" + s + "%" + "\r\n");
    		}
    		fw.close();
		}
		catch (Exception ex) {
		}
	}
    public static void main(String[] args) {
    	Test9 t = new Test9();
    	t.readFiles();
    	t.display();
	}
	public void countCharNum(String s){
		s = s.replaceAll("[^a-zA-Z]","").toLowerCase();
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			int dd = (int) c;
			num[dd - 97]++;
		}
	}
	public void countLines(){
		lines++;
	}
	public void countWords(String s){
		words = words + s.trim().split("\\s+").length;
	}
	public void readFiles(){
		try {
    		Scanner sc = new Scanner(new File("abc.txt"));
    		while(sc.hasNextLine()){
    			String line = sc.nextLine();
    			countLines();
    			countWords(line);
    			countCharNum(line);
    		}
		}
		catch (Exception ex) {
			System.out.println ("Error");
		}
	}
}
