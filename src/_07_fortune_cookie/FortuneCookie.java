package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.print("Button Clicked");

		JFrame frame = new JFrame();
		frame.setVisible(true);

		JButton button = new JButton();
		frame.add(button);
		frame.pack();

		button.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		
		int rand = new Random().nextInt(5);
		
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will win $1,000,000");
		}
		
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will live for 100 years");
		}
		
		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will become famous");
		}
		
		if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will grow 7 feet tall");
		}
		
		if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will become the President of The United States");
		}
		
	}

}
