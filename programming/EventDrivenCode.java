package programming;

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

		JFrame fram = new JFrame();

		fram.setSize(300, 440); // setSize
		fram.setLocationRelativeTo(null);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// container

		JPanel panl = new JPanel();

		// componant
		JLabel labl = new JLabel(" name ");
		JTextField txtName = new JTextField(20);
		panl.add(labl);
		panl.add(txtName);

		JLabel lab2 = new JLabel("password ");

		JTextField txtPass = new JTextField(20);
		JButton butn2 = new JButton("click");
		panl.add(lab2);
		panl.add(txtPass);
		panl.add(butn2);
		fram.add(panl);
		butn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				System.out.println(name);
				String password = txtPass.getText();
				JOptionPane.showMessageDialog(null, " welcome " + name + " Your password is    " + password);
			}
		});
		fram.setVisible(true);
	}
}
