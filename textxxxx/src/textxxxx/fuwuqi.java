package textxxxx;

import java.awt.EventQueue;
import java.net.ServerSocket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class fuwuqi {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fuwuqi window = new fuwuqi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fuwuqi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(31, 36, 54, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(41, 61, 109, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u542F\u52A8\u670D\u52A1\u5668");
		button.setBounds(174, 60, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FDE\u63A5\u5BA2\u6237\u7AEF");
		button_1.setBounds(41, 111, 93, 23);
		frame.getContentPane().add(button_1);
	}
}
