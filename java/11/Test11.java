import javax.swing.*;
import java.awt.*;

public class Test11 extends JFrame{
    public Test11(){
    	setTitle("drawing graphics in frames");
    	setSize(500,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }

    public void paint(Graphics g){
    	super.paint(g);
    	//g.setColor(Color.BLUE);
    	//g.fillRect(0,0,100,100);
		
    	g.setColor(Color.yellow);
    	g.fillOval(180,100,120,120); //头
    	g.fillRect(180,150,120,150); //身体
    	g.setColor(Color.blue); 
    	g.fillArc(180,230,120,120,0,-180); // 裤子
    	g.setColor(Color.white); 
    	g.fillOval(200,140,40,40); //眼镜
    	g.fillOval(240,140,40,40); //眼镜
    	g.setColor(Color.black); 
    	g.fillOval(210,150,20,20); //眼睛
    	g.fillOval(250,150,20,20); //眼睛
    	
    	g.drawOval(200,140,40,40); //眼镜线条
    	g.drawOval(240,140,40,40); //眼镜线条
    	g.drawArc(225,225,31,31,0,-180); // 
    	g.drawLine(225,239,256,239);
    	
    	
    	g.setColor(Color.white); 
    	g.fillOval(215,160,5,5); //眼光
    	g.fillOval(255,160,5,5); //眼光
		g.fillArc(225,225,30,30,0,-180); // 


    }
    
    
    
    public static void main(String[] args) {
        Test11 Frame = new Test11();
    }
}
