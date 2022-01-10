package StudentSearch;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentSearch extends JFrame{
	JTextArea jta = new JTextArea(12,60);
   	JTextField jtf = new JTextField(10);
    public StudentSearch() {
    	JPanel p = new JPanel();
    	JLabel lb = new JLabel("请输入学生姓名：");
    	JScrollPane jsp = new JScrollPane(jta);
    	JButton jbt = new JButton("查找");
    	JButton b2 = new JButton("关闭");
    	b2.addActionListener(ae -> System.exit(0));
    	p.add(lb);
    	p.add(jtf);
    	p.add(jbt);
    	p.add(b2);
    	p.add(jsp);
    	Ac ac = new Ac();
    	jbt.addActionListener(ac);
    	getContentPane().add(p);
    	setSize(800,350);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
    
    class Ac implements ActionListener{
    	public void actionPerformed(ActionEvent ae){
    		String xh = jtf.getText().trim();
    		try {
    			Scanner sc = new Scanner(new File("Data.txt"));
    			String line = "";
    			boolean  find = false;
    			while(sc.hasNextLine()){
    				line = sc.nextLine();
    				String[] aa = line.split("\\s+");
    				if(aa[0].equals(xh)){
    					find = true;
    					break;
    				}
    			}
    			if(find){
    				jta.setText(line);
    			}
    			else{
    				JOptionPane.showMessageDialog(null,"查无此人");
    			}
			}
			catch (Exception ex) {
				System.out.println ("error");
			}
    	}
    }
    
    public static void main(String[] args) {
        new StudentSearch();
    }
}
