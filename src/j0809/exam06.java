package j0809;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class exam06 extends JFrame{
	exam06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("키 어댑터");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JTextField txt1= new JTextField(20);
		add(txt1,BorderLayout.NORTH);       //보더레이아웃 추가
		JLabel lbl = new JLabel(" ");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(lbl,BorderLayout.CENTER); 
		
		txt1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {    //KeyReleased:키를 떼면 작동하는 이벤트
				int key = e.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {         //엔터키가 눌러졌는지 체크
					String str=txt1.getText();
					//setText(area.getText()+str+'\n');
				    lbl.setText("입력한 문자열 : " +str);
					txt1.setText(" ");                //엔터키로 값을 area로 넘긴 후 text를 클리어시켜줌
				}
				
				/*if(!(key>=KeyEvent.VK_0 && key <=KeyEvent.VK_9)) {
					String str=txt1.getText();
					int strlen=str.length();
					
					if(strlen !=0) {                 //TextField에 뭔가가 입력이 되어있다는 말
						txt1.setText(str.substring(0, strlen-1)); //서브스트링으로 잘라서 숫자만 보여줌
					}
		        }*/
				
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// 이벤트실습 -02
		
		new exam06();

	}
		
		}
