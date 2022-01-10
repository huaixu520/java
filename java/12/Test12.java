import java.awt.*;
import javax.swing.*;

public class Test12 extends JFrame{
        
    public Test12() {
    	JPanel p = new JPanel();
    	JPanel p1 = new JPanel();
    	JPanel p2 = new JPanel();
    	JPanel p3 = new JPanel();
    	JPanel p4 = new JPanel();
    	GridLayout gl = new GridLayout(4,1);
    	p.setLayout(gl);
    	JLabel lb1 = new JLabel("用户登录窗口");
    	JLabel lb2 = new JLabel("用户名");
    	JLabel lb3 = new JLabel("密码");
    	JTextField jtf = new JTextField(10);
    	JPasswordField jpf = new JPasswordField(10);
    	JButton b1 = new JButton("登录");
    	JButton b2 = new JButton("重置");
    	JButton b3 = new JButton("关闭");
    	
    	p1.add(lb1);
    	p2.add(lb2);
    	p2.add(jtf);
    	p3.add(lb3);
    	p3.add(jpf);
    	p4.add(b1);
    	p4.add(b2);
    	p4.add(b3);
    	p.add(p1);
    	p.add(p2);
    	p.add(p3);
    	p.add(p4);
    	getContentPane().add(p);
    	setSize(250,250);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
    
    public static void main(String[] args) {
    	new Test12();
    }
}
