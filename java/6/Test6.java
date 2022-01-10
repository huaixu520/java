import java.util.*;


public class Test6 {
	int a,b,c;
	
    public Test6() {
    }
    
    public void input(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println ("输入三角形三边");
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = sc.nextInt();
    }
    
    public boolean judge(){
    	boolean yn = false;
    	if((a+b>c)&&(a+c>b)&&(b+c>a)){
    		yn = true;
    	}
    	return yn;
    }
    
    public void s(){
    	double p = (a+b+c)/2.0;
    	double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    	System.out.println ("三角形面积为："+s);
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.input();
        if(t.judge()){
        	t.s();
        }
        else System.out.println ("不是三角形");
    }
}
