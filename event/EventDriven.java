import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame  fram=new JFrame();

fram.setSize(400, 300);
fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//container

JPanel panl=new JPanel();

//componant
JLabel labl=new JLabel("name");
JTextField txtName=new JTextField(20);
JButton btn=new JButton ("Say hello");
btn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name=txtName.getText();
		System.out.println(name);
		JOptionPane.showMessageDialog(null,"  hello   "+name);
	}
});



panl.add(labl);
panl.add(txtName);
panl.add(btn);
fram.add(panl);
fram.setVisible(true);
	}

}
