import java.util.*;
import java.io.*;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("输入半径、长、宽");
        int r = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        MyCircle c = new MyCircle();
        System.out.println ("圆的周长："+c.zc(r));       
        System.out.println ("圆的面积："+c.area(r));
        MyRectangle re = new MyRectangle();
        System.out.println ("矩形周长："+re.zc(a,b));
        System.out.println ("矩形面积："+re.area(a,b));
    }
}

abstract class MyShape{
	public abstract int zc(int x,int y);
	public abstract double area(int x,int y);
}


class MyRectangle extends MyShape{
	public int zc(int x,int y){
		return 2*(x+y);
	}
	public double area(int x,int y){
		return x*y;
	}
}


class MyCircle extends MyShape{
	public int zc(int x,int y){
		return 0;
	}
	public double area(int x,int y){
		return 0.0;
	}
	public int zc(int r){
		return (int)(2*Math.PI*r);
	}
	public double area(int r){
		return Math.PI*r*r;
	}
}