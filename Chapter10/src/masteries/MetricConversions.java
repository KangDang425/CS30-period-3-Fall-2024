package masteries;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversions {

	private JFrame frame;
	private JTextField Output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversions window = new MetricConversions();
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
	public MetricConversions() {
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
		
		Output = new JTextField();
		Output.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Output.setText("1 foot == 0.3048 meters");
		Output.setBounds(236, 86, 188, 35);
		panel.add(Output);
		Output.setColumns(10);
		
		//Combo box select and choose
		JComboBox Input = new JComboBox();
		Input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String out = (String) Input.getSelectedItem();
				if (out == "inch to centimeters") {
					Output.setText("1 inch == 2.54 centimeters");
				} else if (out == "gallon to liters") {
					Output.setText("1 gallon is 4.5461 liters");
				} else if (out == "pound to kilograms") {
					Output.setText("1 pound is 0.4536 kilograms");
				} 
				else {
					Output.setText("1 foot is 0.3048 meters");
				}
					
				
				
			}
		});
		Input.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Input.setModel(new DefaultComboBoxModel(new String[] {"feet to meters", "inch to centimeters", "gallon to liters", "pound to kilograms"}));
		Input.setBounds(10, 86, 196, 35);
		panel.add(Input);
		
		JLabel NoChangy = new JLabel("Select a conversion type !");
		NoChangy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		NoChangy.setBounds(10, 61, 193, 14);
		panel.add(NoChangy);
		
		
	}

}
