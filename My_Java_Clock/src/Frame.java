
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame {
	
//	Calendar calendar;
	
	SimpleDateFormat timeFormat;
	JLabel timelabel;
	
	SimpleDateFormat dayFormat;
	JLabel daylabel;
	
	SimpleDateFormat dateFormat;
	JLabel datelabel;
	
	String time;
	String day;
	String date;
	
	public Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My First Java Clock");
		this.setLayout(new FlowLayout());
		this.setSize(310, 200);
		this.getContentPane().setBackground(Color.black);
		this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.red, 3));
		this.setResizable(false);
		

		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timelabel = new JLabel();
		timelabel.setFont(new Font("Kristen ITC", Font.BOLD, 45));
//		timelabel.setBackground(Color.black);
		timelabel.setForeground(new Color(0x00FF00));
		timelabel.setOpaque(false);
		
		dayFormat = new SimpleDateFormat("EEEE");
		daylabel = new JLabel();
		daylabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		daylabel.setForeground(new Color(0xFFFFFF));
		
		dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");
		datelabel = new JLabel();
		datelabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		datelabel.setForeground(new Color(0xFFFFFF));
		
		this.add(timelabel);
		this.add(daylabel);
		this.add(datelabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		
		while (true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timelabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			daylabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			datelabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
