package NumberCalcIntoFile;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;


public class NumberCalcIntoFile extends JFrame{
    JTextField jtf = new JTextField(10);
    JTextArea jta = new JTextArea(5,40);
    
    class Count implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		String s = jtf.getText();
    		int N = Integer.parseInt(s);
    		int numj = 0;
    		int numo = 0;
    		int nj = 0;
    		int no = 0;
    		for (int i = 1; i<N; i++) {
    			if(i%2==1){
    				numj = numj + i*i;
    				nj = nj + 1;
    			}
    			else{
    				numo = numo + i*i;
    				no = no + 1;
    			}
			}
			String ss1 = "����ƽ���ͣ�";
			String ss2 = "����������";
			String ss3 = "ż��ƽ���ͣ�";
			String ss4 = "ż��������";
			String all = ss1+String.valueOf(numj)+'\n'+ss2+String.valueOf(nj)+
				'\n'+ss3+String.valueOf(numo)+'\n'+ss4+String.valueOf(no);
			jta.setText(all);
    	}
    }
    
    class Save implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		String s = jtf.getText();
    		int N = Integer.parseInt(s);
    		int numj = 0;
    		int numo = 0;
    		int nj = 0;
    		int no = 0;
    		for (int i = 1; i<=N; i++) {
    			if(i%2==1){
    				numj = numj + i*i;
    				nj = nj + 1;
    			}
    			else{
    				numo = numo + i*i;
    				no = no + 1;
    			}
			}
			String ss1 = "����ƽ���ͣ�";
			String ss2 = "����������";
			String ss3 = "ż��ƽ���ͣ�";
			String ss4 = "ż��������";
			String all = ss1+String.valueOf(numj)+'\n'+ss2+String.valueOf(nj)+
				'\n'+ss3+String.valueOf(numo)+'\n'+ss4+String.valueOf(no);
			jta.setText(all);
			try {
				File file = new File("js.dat");
				if(!file.exists()){
       				file.createNewFile();
      			}
      			FileWriter fileWritter = new FileWriter(file.getName(),true);
      			fileWritter.write(all);
      			fileWritter.close();
      			JOptionPane.showMessageDialog(null,"�ѱ���");
			}	
			catch (Exception ex) {
				ex.printStackTrace();
			}
    	}
    }
    
    
    public NumberCalcIntoFile() {
    	JPanel p = new JPanel();
    	JLabel lb = new JLabel("��������");
    	JButton b1 = new JButton("����");
    	b1.addActionListener(new Count());
    	JButton b2 = new JButton("����");
    	b2.addActionListener(new Save());
    	JButton b3 = new JButton("�ر�");
    	b3.addActionListener(e -> System.exit(0));
		p.add(lb);
		p.add(jtf);
		p.add(jta);
		p.add(b1);
		p.add(b2);
		p.add(b3);
    	getContentPane().add(p);
    	setSize(500,220);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
    
    public static void main(String[] args) {
    	new NumberCalcIntoFile();
    }
}

