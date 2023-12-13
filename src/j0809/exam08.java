package j0809;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam08 extends JFrame {
	exam08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("원 넓이 구하기");
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
    	JLabel lbl1 = new JLabel("원의 반지름:");
		add(lbl1);
    	JTextField txt = new JTextField(15);
    	add(txt);
    	
    	JLabel lbl2 = new JLabel("원의 넓이:");
		add(lbl2);
    	JTextField result = new JTextField(10); 
        add(result);
        
        JTextArea area = new JTextArea(5, 20);
        area.setEditable(false);
        area.setForeground(Color.RED);
        add(area, BorderLayout.SOUTH);
        

    	JButton cal=new JButton("계산");
        add(cal);
        cal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String num=txt.getText();
				int soo=Integer.parseInt(num);
				double j = 3.14;
				double n=soo*soo;
				String re=Double.toString(n*j);
				result.setText(re);
		    	area.setText(soo+ "*" +soo+ "* 3.14 = " +re);
			}
        	
        });
        
        JButton reset=new JButton("리셋");
        add(reset);
   
       
       
        
    	setSize(300, 250);
    	setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// 이벤트실습 -03'
    new exam08();
	}

}
