package lab_05;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -471574893774892319L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stop");
		btnNewButton_1.setBounds(10, 60, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JPanel north = new JPanel();
		north.setBorder(new LineBorder(new Color(0, 0, 0)));
		north.setBounds(105, 10, 121, 21);
		contentPane.add(north);
		north.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel south = new JPanel();
		south.setBorder(new LineBorder(new Color(0, 0, 0)));
		south.setBounds(105, 82, 121, 21);
		contentPane.add(south);
		south.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel west = new JPanel();
		west.setBorder(new LineBorder(new Color(0, 0, 0)));
		west.setBounds(105, 32, 34, 49);
		contentPane.add(west);
		west.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel east = new JPanel();
		east.setBorder(new LineBorder(new Color(0, 0, 0)));
		east.setBounds(192, 32, 34, 49);
		contentPane.add(east);
		east.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel bridge = new JPanel();
		bridge.setBorder(new LineBorder(new Color(0, 0, 0)));
		bridge.setBounds(149, 32, 34, 49);
		bridge.setLayout(new GridLayout(3, 1, 0, 0));
		
		contentPane.add(bridge);
		List<List<JLabel>> labels = new ArrayList();
		for(int i=0; i<5; i++) {
			labels.add(new ArrayList());
		}
		for(int i=0; i<4; i++) {
			labels.get(0).add(new JLabel("-"));
			labels.get(1).add(new JLabel("-"));
			labels.get(2).add(new JLabel("-"));
			labels.get(3).add(new JLabel("-"));
		}
		for(int i=0;i<3;i++) {
			labels.get(4).add(new JLabel("[ ]"));
		}
		for(JLabel label : labels.get(0)) {
			label.setHorizontalAlignment(SwingConstants.CENTER);
			north.add(label);
		}
		for(JLabel label : labels.get(1)) {
			label.setHorizontalAlignment(SwingConstants.CENTER);
			south.add(label);
		}
		for(JLabel label : labels.get(2)) {
			label.setHorizontalAlignment(SwingConstants.CENTER);
			east.add(label);
		}
		for(JLabel label : labels.get(3)) {
			label.setHorizontalAlignment(SwingConstants.CENTER);
			west.add(label);
		}
		for(JLabel label : labels.get(4)) {
			label.setHorizontalAlignment(SwingConstants.CENTER);
			bridge.add(label);
		}
	}
}
