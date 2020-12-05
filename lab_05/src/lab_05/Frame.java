package lab_05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1078623303763907873L;
	private JPanel contentPane;
	private List<JLabel> labels = new ArrayList<JLabel>((Arrays.asList(null,null,null,null,
			null,null,null,null,
			null,null,null,null,
			null,null,null,null,
			null,null,null)));
	private Bridge bridge;
	private Barge barge1;
	private Barge barge2;
	private Barge barge3;
	private Vehicle vehicle1;
	private Vehicle vehicle2;
	private Vehicle vehicle3;
	
	public void setText(int position, String text) {
		labels.get(position).setText(text);
	}
	public void createThreads() {
		bridge = new Bridge(this);
		barge1 = new Barge("b1", 2000, bridge, 0, this, 0);
		barge2 = new Barge("b2", 2000, bridge, 0, this, 1);
		barge3 = new Barge("b3", 2000, bridge, 0, this, 2);
		vehicle1 = new Vehicle("v1", 1000, bridge, 0, this, 0);
		vehicle2 = new Vehicle("v2", 1000, bridge, 0, this, 1);
		vehicle3 = new Vehicle("v3", 1000, bridge, 0, this, 2);
	}
	public void startThreads() {
		MyThread.setRun(true);
		barge1.start();
		barge2.start();
		barge3.start();
		vehicle1.start();
		vehicle2.start();
		vehicle3.start();
	}
	public void stopThreads() {
		MyThread.setRun(false);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel buttons = new JPanel();
		contentPane.add(buttons);
		buttons.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Start");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createThreads();
				startThreads();
			}
		});
		buttons.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Stop");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stopThreads();
			}
		});
		buttons.add(btnNewButton);
		
		JPanel display = new JPanel();
		contentPane.add(display);
		display.setLayout(null);
		
		JPanel north = new JPanel();
		north.setBorder(new LineBorder(new Color(0, 0, 0)));
		north.setBounds(10, 10, 193, 40);
		display.add(north);
		north.setLayout(new GridLayout(1, 4, 0, 0));
		
		labels.set(0, new JLabel("-"));
		labels.get(0).setHorizontalAlignment(SwingConstants.CENTER);
		north.add(labels.get(0));
		
		labels.set(1, new JLabel("-"));
		labels.get(1).setHorizontalAlignment(SwingConstants.CENTER);
		north.add(labels.get(1));
		
		labels.set(2, new JLabel("-"));
		labels.get(2).setHorizontalAlignment(SwingConstants.CENTER);
		north.add(labels.get(2));
		
		labels.set(3, new JLabel("-"));
		labels.get(3).setHorizontalAlignment(SwingConstants.CENTER);
		north.add(labels.get(3));
		
		JPanel south = new JPanel();
		south.setBorder(new LineBorder(new Color(0, 0, 0)));
		south.setBounds(10, 203, 193, 40);
		display.add(south);
		south.setLayout(new GridLayout(1, 4, 0, 0));
		
		labels.set(4, new JLabel("-"));
		labels.get(4).setHorizontalAlignment(SwingConstants.CENTER);
		south.add(labels.get(4));
		
		labels.set(5, new JLabel("-"));
		labels.get(5).setHorizontalAlignment(SwingConstants.CENTER);
		south.add(labels.get(5));
		
		labels.set(6, new JLabel("-"));
		labels.get(6).setHorizontalAlignment(SwingConstants.CENTER);
		south.add(labels.get(6));
		
		labels.set(7, new JLabel("-"));
		labels.get(7).setHorizontalAlignment(SwingConstants.CENTER);
		south.add(labels.get(7));
		
		JPanel west = new JPanel();
		west.setBorder(new LineBorder(new Color(0, 0, 0)));
		west.setBounds(10, 60, 40, 133);
		display.add(west);
		west.setLayout(new GridLayout(4, 1, 0, 0));
		
		labels.set(8, new JLabel("-"));
		labels.get(8).setHorizontalAlignment(SwingConstants.CENTER);
		west.add(labels.get(8));
		
		labels.set(9, new JLabel("-"));
		labels.get(9).setHorizontalAlignment(SwingConstants.CENTER);
		west.add(labels.get(9));
		
		labels.set(10, new JLabel("-"));
		labels.get(10).setHorizontalAlignment(SwingConstants.CENTER);
		west.add(labels.get(10));
		
		labels.set(11, new JLabel("-"));
		labels.get(11).setHorizontalAlignment(SwingConstants.CENTER);
		west.add(labels.get(11));
		
		JPanel east = new JPanel();
		east.setBorder(new LineBorder(new Color(0, 0, 0)));
		east.setBounds(163, 60, 40, 133);
		display.add(east);
		east.setLayout(new GridLayout(4, 1, 0, 0));
		
		labels.set(12, new JLabel("-"));
		labels.get(12).setHorizontalAlignment(SwingConstants.CENTER);
		east.add(labels.get(12));
		
		labels.set(13, new JLabel("-"));
		labels.get(13).setHorizontalAlignment(SwingConstants.CENTER);
		east.add(labels.get(13));
		
		labels.set(14, new JLabel("-"));
		labels.get(14).setHorizontalAlignment(SwingConstants.CENTER);
		east.add(labels.get(14));
		
		labels.set(15, new JLabel("-"));
		labels.get(15).setHorizontalAlignment(SwingConstants.CENTER);
		east.add(labels.get(15));
		
		JPanel bridge = new JPanel();
		bridge.setBorder(new LineBorder(new Color(0, 0, 0)));
		bridge.setBounds(60, 60, 93, 133);
		display.add(bridge);
		bridge.setLayout(new GridLayout(3, 1, 0, 0));
		
		labels.set(16, new JLabel("[ ]"));
		labels.get(16).setHorizontalAlignment(SwingConstants.CENTER);
		bridge.add(labels.get(16));
		
		labels.set(17, new JLabel("[ ]"));
		labels.get(17).setHorizontalAlignment(SwingConstants.CENTER);
		bridge.add(labels.get(17));
		
		labels.set(18, new JLabel("[ ]"));
		labels.get(18).setHorizontalAlignment(SwingConstants.CENTER);
		bridge.add(labels.get(18));
	}
}
