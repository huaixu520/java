package Test23;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class Test23 {
    public static void findFirstHashMap(String str){
        //ͳ���ַ�����ÿ���ַ����ֵĴ���
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
            	String s = "�ַ�����ֻ����2�ε����һ���ַ��ǣ�"+m.getKey();
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
        System.out.println("����һ���ַ�����");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String r = new StringBuffer(s).reverse().toString();
        findFirstHashMap(r);
	}
}