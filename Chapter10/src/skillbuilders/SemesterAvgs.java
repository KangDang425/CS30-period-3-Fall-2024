package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class SemesterAvgs {

	private JFrame frame;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvgs window = new SemesterAvgs();
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
	public SemesterAvgs() {
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
		
		JLabel lblNewLabel = new JLabel("Grade 1 ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 65, 14);
		panel.add(lblNewLabel);
		
		JLabel lblGrade = new JLabel("Grade 2");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrade.setBounds(10, 53, 65, 14);
		panel.add(lblGrade);
		
		JLabel lblNewLabel_1_1 = new JLabel("Grade 3");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 88, 65, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel disp1 = new JLabel("");
		disp1.setBounds(297, 13, 106, 100);
		panel.add(disp1);
		
		gr1 = new JTextField();
		gr1.setBounds(69, 10, 86, 20);
		panel.add(gr1);
		gr1.setColumns(10);
		
		gr2 = new JTextField();
		gr2.setColumns(10);
		gr2.setBounds(69, 52, 86, 20);
		panel.add(gr2);
		
		gr3 = new JTextField();
		gr3.setColumns(10);
		gr3.setBounds(69, 87, 86, 20);
		panel.add(gr3);
		
		JButton btnNewButton = new JButton("submit ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat dc = new DecimalFormat("0.00");
				double grTx1 = Double.parseDouble(gr1.getText());
				double grTx2 = Double.parseDouble(gr2.getText());
				double grTx3 = Double.parseDouble(gr3.getText());
				
				double average = (grTx1+grTx2+grTx3)/3 ;
			
				disp1.setText(dc.format(average));
				
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 129, 130, 52);
		panel.add(btnNewButton);
		
		
	}
}
