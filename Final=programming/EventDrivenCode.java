package Programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventDrivenCode {

	public static void main(String[] args) {
	
		JFrame  fram=new JFrame();        

		fram.setSize(140, 340);       //setSize
		fram.setLocationRelativeTo(null);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//container

		JPanel panl=new JPanel();

		//componant
		JLabel labl=new JLabel(" name ");
		JTextField txtName=new JTextField(20);
		JButton butn=new JButton ("click");
		panl.add(labl);
		panl.add(txtName);
		panl.add(butn);
		
	
		butn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=txtName.getText();
			
				System.out.println(name);
				JOptionPane.showMessageDialog(null,"  welcome   "+name );
			}
		});
		
		JLabel lab2=new JLabel("password ");
	
		JTextField txtpass=new JTextField(20);
		JButton butn2=new JButton ("click");
		panl.add(lab2);
		panl.add(txtpass);
		panl.add(butn2);
		fram.add(panl);
	butn2.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String password=txtpass.getText();
				
				JOptionPane.showMessageDialog(null," Your password is    "+ password );
			}
		});

		
		
		fram.setVisible(true);
			}
	}


