package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
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
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "HONK! HONK!");
		}
		
		if(event.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "BANG BANG");
		}
		
		if(event.getSource() == button3) {
			JOptionPane.showMessageDialog(null, "BUZZZZ");
		}
		
		
		
	}

}
