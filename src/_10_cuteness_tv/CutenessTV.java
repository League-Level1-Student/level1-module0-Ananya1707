package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;
	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		button1 = new JButton("1");
		panel.add(button1);
		
		button2 = new JButton("2");
		panel.add(button2);
		
		button3 = new JButton("3");
		panel.add(button3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Cuteness");
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "More cuteness");
		}
		if(e.getSource() == button3) {
			JOptionPane.showMessageDialog(null, "Even more cutenesssssss");
		}
	}

}
