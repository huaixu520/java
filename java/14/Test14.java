import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test14 extends JFrame{
    JTextArea jta = new JTextArea(12,60);
    JTextField jtf = new JTextField(10);
    JScrollPane jsp = new JScrollPane(jta);
    JButton jbt = new JButton("查找");
    
    public Test14() {
    	JPanel p = new JPanel();
    	p.add(jtf);
    	p.add(jbt);
    	p.add(jsp);
    	
    	Ac ac = new Ac();
    	jbt.addActionListener(ac);
    	getContentPane().add(p);
    	setSize(800,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    	//Mp3Player mp = new Mp3Player("123.mp3");
    	//mp.start();
    }
    
    class Ac implements ActionListener{
    	public void actionPerformed(ActionEvent ae){
    		String xh = jtf.getText().trim();
    		try {
    			Scanner sc = new Scanner(new File("11.txt"));
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
        // TODO code application logic here
        new Test14();
    }
}
