package _09_sound_effects_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton button1 = new JButton();
		panel.add(button1);
		
		JButton button2 = new JButton();
		panel.add(button2);
		
		JButton button3 = new JButton();
		panel.add(button3);
	}

}
