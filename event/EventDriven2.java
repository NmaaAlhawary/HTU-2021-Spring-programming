package edu.jo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDriven2 {
	  static int counter=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame  fram=new JFrame("practice 3");
		fram.setSize(400, 300);
		fram.setLocationRelativeTo(null);

		 JButton butPlus=new JButton("+");
		 JLabel lab=new JLabel("0");
		  JButton butMinus=new JButton("-");
	//fram.add(butPlus);
	butPlus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//String count=lab.getText();
			//int value=Integer.parseInt(count);
			lab.setText(""+(counter++));
			//System.out.println(++value);
		}
	});
	butMinus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			lab.setText(""+(counter--));
		}
	});
	
			
		
		
fram.add(butMinus);
fram.add(lab);
fram.add(butPlus);
fram.setLayout(new FlowLayout() ); /////what is role?
fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fram.setVisible(true);

	}

}
