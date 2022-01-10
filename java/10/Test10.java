public class Test10 {
	
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        	
        	Demo d = new Demo();
        	double data = d.div(10,20);
        	System.out.println (data);
    		data = d.div(-10,20);
        	System.out.println (data);
        	data = d.div(10,-20);
        	System.out.println (data);
        	data = d.div(-10,-20);
        	System.out.println (data);
		}
		catch (Exception ex) {
			System.out.println (ex.getMessage());
		}
		finally{
			System.out.println ("111");
		}
    }
}

class MyException extends Exception{
    public MyException(){
 
    }
 
    public MyException(String message){
        super(message);
    }
}

class Demo{
	public double div(int a,int b) throws MyException{
		if(b<0) throw new MyException("除数为负数");
		double d = a/b;
		return d;
	}
}