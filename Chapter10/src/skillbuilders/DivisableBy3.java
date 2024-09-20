package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisableBy3 {

	private JFrame frame;
	private JTextField Input;
	private JTextField Output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisableBy3 window = new DivisableBy3();
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
	public DivisableBy3() {
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
		
		JLabel DontChangeMe = new JLabel("Enter a integer:");
		DontChangeMe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DontChangeMe.setBounds(86, 53, 101, 35);
		panel.add(DontChangeMe);
		
		Output = new JTextField();
		Output.setBounds(226, 145, 185, 20);
		panel.add(Output);
		Output.setColumns(10);
		
		
		Input = new JTextField();
		Input.setBounds(251, 62, 86, 20);
		panel.add(Input);
		Input.setColumns(10);
		
		JButton Submit = new JButton("Check !");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				num1 = Integer.parseInt(Input.getText());
				
				
				if (num1 % 3 == 0)
				{
					 Output.setText("Your number is divisible. :D");
				}
				else
				{
					Output.setText("Your number is not divisible by 3. ");
				}
				
			}
		});
		Submit.setForeground(new Color(0, 0, 0));
		Submit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Submit.setBackground(new Color(0, 255, 0));
		Submit.setBounds(75, 139, 123, 73);
		panel.add(Submit);
		
		
	}
}
