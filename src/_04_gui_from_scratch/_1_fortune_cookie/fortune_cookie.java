package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie {
	public void JFrame() {
		System.out.println("Button Clicked");
		JFrame window = new JFrame();
		Window frame = null;
		frame.setVisible(true);
		JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener((ActionListener) this); 
	    actionPreformed(JOptionPane.showInputDialog("WooHoo"));
	    int rand = new Random().nextInt(5);

	}

	private void actionPreformed(String showInputDialog) {
		
		
	}

	public void showButton() {
		
		
	}
}
