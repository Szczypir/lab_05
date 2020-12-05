package lab_05;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { }

        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	} 	
}
