package Test23;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class Test23 {
    public static void findFirstHashMap(String str){
        //统计字符串中每个字符出现的次数
        Map<Character,Integer> map=new LinkedHashMap<>();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int val=map.get(arr[i])+1;
                map.put(arr[i],val);
            }else
            {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()==2)
            {
            	String s = "字符串中只出现2次的最后一个字符是："+m.getKey();
                System.out.println(s);
                try {
					File file = new File("data3.txt");
					if(!file.exists()){
       					file.createNewFile();
      				}
      			FileWriter fileWritter = new FileWriter(file.getName(),true);
      			fileWritter.write(s);
      			fileWritter.close();
				}	
				catch (Exception ex) {
					ex.printStackTrace();
				}
                return;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("输入一个字符串：");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String r = new StringBuffer(s).reverse().toString();
        findFirstHashMap(r);
	}
}