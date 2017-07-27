package textxxxx;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;





public class wq extends JFrame{
	public wq(){
		this.setTitle("game");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new we());
		this.setVisible(true);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new wq();
	}
}

 class we extends JPanel{
	private int x=0,y=0;
	private int xspeed,yspeed;
	private Timer timer;

	public we(){
		timer=new Timer(20,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics q) {
		// TODO Auto-generated method stub
		super.paintComponent(q);
		q.drawOval(0, 0, 50, 50);
		
	}
	
 }
 
 
