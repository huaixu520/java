public class Test3 {

    public static void main (String[] args){
            for(int i=0x4e00;i<=0x9fa5;i++)
            {
                    System.out.print(i);
                    System.out.print((char)i);
                    System.out.print("\t");
                    if(i%10==0)
                            System.out.println();
            }
    }
    
    
}