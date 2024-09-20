package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class MetricConverstions {

	private JFrame frame;
	private JTextField txtInputNumHere;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConverstions window = new MetricConverstions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConverstions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtInputNumHere = new JTextField();
		txtInputNumHere.setText("input num here");
		txtInputNumHere.setBounds(24, 47, 86, 20);
		panel.add(txtInputNumHere);
		txtInputNumHere.setColumns(10);
		
		textField = new JTextField();
		textField.setText("input num here");
		textField.setColumns(10);
		textField.setBounds(24, 84, 86, 20);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("press for conversions");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(26, 158, 119, 60);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Metric Conversion :P");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(149, 11, 165, 36);
		panel.add(lblNewLabel);
	}
}
