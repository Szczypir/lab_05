package lab_05;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { }

        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		Bridge bridge = new Bridge();
		Vehicle vehicle = new Vehicle("V", 1000, bridge, 0);
		Barge barge = new Barge("B", 3000, bridge, 0);
		vehicle.start();
		barge.start();
	}
	
}
