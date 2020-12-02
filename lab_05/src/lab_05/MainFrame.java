package lab_05;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		
		JPanel p = new JPanel();
		p.setBounds(105, 10, 85, 71);
		contentPane.add(p);
		p.setLayout(new GridLayout(5, 5, 0, 0));
		
		JLabel l11 = new JLabel("-");
		JLabel l12 = new JLabel("-");
		JLabel l13 = new JLabel("-");
		JLabel l14 = new JLabel("-");
		JLabel l15 = new JLabel("-");
		JLabel l21 = new JLabel("~~");
		JLabel l22 = new JLabel("~~");
		JLabel l23 = new JLabel("[ ]");
		JLabel l24 = new JLabel("~~");
		JLabel l25 = new JLabel("~~");
		JLabel l31 = new JLabel("~~");
		JLabel l32 = new JLabel("~~");
		JLabel l33 = new JLabel("[ ]");
		JLabel l34 = new JLabel("~~");
		JLabel l35 = new JLabel("~~");
		JLabel l41 = new JLabel("~~");
		JLabel l42 = new JLabel("~~");
		JLabel l43 = new JLabel("[ ]");
		JLabel l44 = new JLabel("~~");
		JLabel l45 = new JLabel("~~");
		JLabel l51 = new JLabel("-");
		JLabel l52 = new JLabel("-");
		JLabel l53 = new JLabel("-");
		JLabel l54 = new JLabel("-");
		JLabel l55 = new JLabel("-");
		l11.setHorizontalAlignment(SwingConstants.CENTER);
		l12.setHorizontalAlignment(SwingConstants.CENTER);
		l13.setHorizontalAlignment(SwingConstants.CENTER);
		l14.setHorizontalAlignment(SwingConstants.CENTER);
		l15.setHorizontalAlignment(SwingConstants.CENTER);
		l21.setHorizontalAlignment(SwingConstants.CENTER);
		l22.setHorizontalAlignment(SwingConstants.CENTER);
		l23.setHorizontalAlignment(SwingConstants.CENTER);
		l24.setHorizontalAlignment(SwingConstants.CENTER);
		l25.setHorizontalAlignment(SwingConstants.CENTER);
		l31.setHorizontalAlignment(SwingConstants.CENTER);
		l32.setHorizontalAlignment(SwingConstants.CENTER);
		l33.setHorizontalAlignment(SwingConstants.CENTER);
		l34.setHorizontalAlignment(SwingConstants.CENTER);
		l35.setHorizontalAlignment(SwingConstants.CENTER);
		l41.setHorizontalAlignment(SwingConstants.CENTER);
		l42.setHorizontalAlignment(SwingConstants.CENTER);
		l43.setHorizontalAlignment(SwingConstants.CENTER);
		l44.setHorizontalAlignment(SwingConstants.CENTER);
		l45.setHorizontalAlignment(SwingConstants.CENTER);
		l51.setHorizontalAlignment(SwingConstants.CENTER);
		l52.setHorizontalAlignment(SwingConstants.CENTER);
		l53.setHorizontalAlignment(SwingConstants.CENTER);
		l54.setHorizontalAlignment(SwingConstants.CENTER);
		l55.setHorizontalAlignment(SwingConstants.CENTER);
		p.add(l11); p.add(l12); p.add(l13); p.add(l14); p.add(l15);
		p.add(l21); p.add(l22); p.add(l23); p.add(l24); p.add(l25);
		p.add(l31); p.add(l32); p.add(l33); p.add(l34); p.add(l35);
		p.add(l41); p.add(l42); p.add(l43); p.add(l44); p.add(l45);
		p.add(l51); p.add(l52); p.add(l53); p.add(l54); p.add(l55);
	}
}
