package textxxxx;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class windowaaaaa extends JFrame{
	private JLabel dengluming;
	private JPasswordField mima;
	private JTextField a;
	public windowaaaaa(){
		Font st=new Font("ËÎÌå",Font.PLAIN,36);
		dengluming=new JLabel("µÇÂ¼Ãû£º");
		dengluming.setFont(st);
		dengluming.setBounds(100, 100, 150, 40);
		a=new JTextField();
		a.setFont(st);
		a.setBounds(250, 100, 300, 40);
		
	}
}
