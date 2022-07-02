package digitalclock;

import java.awt.FlowLayout; 
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class clock extends JFrame{
	 
	JLabel jlabClock ;
	clockthread ct;
	
	public clock() {
		
		jlabClock =new JLabel("");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,80));
		jlabClock.setOpaque(true);
		jlabClock.setBackground(Color.BLACK);
		jlabClock.setForeground(Color.WHITE);
		add(jlabClock);
		setSize(1150,142);
		setLocationRelativeTo(null);
		ct=new clockthread(this);
		setVisible(true);
		
		
	}
	
public static void main(String[]args){
	
	
	new clock();
	
	
  }

}
