import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Test13 extends JFrame{
    JTextField jtf = new JTextField(10);
    JTextArea jta = new JTextArea(5,40);
    
    class Ac implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		Random rd = new Random();
    		String s = jtf.getText();
    		int N = Integer.parseInt(s);
    		int[] num = new int[10];
    		for (int i = 0; i<10; i++) {
    			num[i] = rd.nextInt(N);
			}
			Arrays.sort(num);
			String ss = "十个随机数结果：";
			for (int i = 0; i<10; i++) {
				ss = ss+ num[i]+"、";
			}
			jta.setText(ss);
    	}
    }
    public Test13() {
    	JPanel p = new JPanel();
    	JLabel lb = new JLabel("输入一个整数");
    	JButton b1 = new JButton("计算");
    	b1.addActionListener(new Ac());
    	JButton b2 = new JButton("关闭");
    	b2.addActionListener(e -> System.exit(0));
		p.add(lb);
		p.add(jtf);
		p.add(jta);
		p.add(b1);
		p.add(b2);

    	getContentPane().add(p);
    	setSize(500,220);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
    
    public static void main(String[] args) {
    	new Test13();
    }
}
