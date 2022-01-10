package Test22;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;
 
public class Test22 {
	public static String lengthOfLongestSubstring(String s) {
	    int n = s.length();
	    int start=0;
	    int head = 0;
	    int ans=0;
	    Map<Character, Integer> map = new HashMap<>();
	    for (int end = 0; end < n; end++) {
	        char alpha = s.charAt(end);
	        //出现了重复值就更新新值的下标
	        if (map.containsKey(alpha)) {
	        	start = Math.max(map.get(alpha), start);
	        }
	         //长度计算，若是一直比ans小，则当前的最大长度是ans,同时记住start和长度，在最后取得时候
	        if (ans<(end - start + 1)) {
	          	ans=end - start + 1;
	          	head=start;
			}
	        //更新map连的下边
	        map.put(s.charAt(end), end + 1);
	    }
	    return s.substring(head, ans+head);	 
	}
	public static void main(String[] args) {
		String str = "123545rtyuiewwer21q3q2r2qrqrq23aewqt3qr35y2yhw";
		String s = lengthOfLongestSubstring(str);
		String ss = "长度是：" + lengthOfLongestSubstring(str).length();
		String sss = s + "\n"+ ss;
		System.out.println (s);
		System.out.println (ss);
		try {
			File file = new File("data2.txt");
			if(!file.exists()){
       			file.createNewFile();
      		}
      		FileWriter fileWritter = new FileWriter(file.getName(),true);
      		fileWritter.write(sss);
      		fileWritter.close();
		}	
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
 
}