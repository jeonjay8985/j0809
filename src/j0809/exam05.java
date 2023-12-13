package j0809;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam05 extends JFrame{
	exam05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 맛보기");
		
		Container c= getContentPane();
	    c.setLayout(new FlowLayout());
	    
	    JButton btn = new JButton("클릭");
	    add(btn);
	    
	    btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼을 클릭했습니다.");
				
			}
	    	
	    	
	    });
	
	    
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// 이벤트실습 -01
     new exam05();
	}

}
