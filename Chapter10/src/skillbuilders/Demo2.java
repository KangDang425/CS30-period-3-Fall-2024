package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo2 {

	private JFrame frame;
	private JTextField fnt;
	private JTextField lnt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 window = new Demo2();
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
	public Demo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		ImageIcon CHHS = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\images 2.png");
		ImageIcon Pearson = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\images 1.jfif");
		ImageIcon Western = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\images.png");
		
		
		
		
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fnt = new JTextField();
		fnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				fnt.setText("");
				
			}
		});
		fnt.setForeground(new Color(128, 128, 128));
		fnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fnt.setText("First name");
		fnt.setBounds(44, 57, 132, 35);
		panel.add(fnt);
		fnt.setColumns(10);
		
		JComboBox Grades = new JComboBox();
		Grades.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Grades.setModel(new DefaultComboBoxModel(new String[] {"Select your grade !", "10", "11", "12"}));
		Grades.setBounds(44, 103, 132, 35);
		panel.add(Grades);
		
		
		JComboBox School = new JComboBox();
		School.setFont(new Font("Tahoma", Font.PLAIN, 12));
		School.setModel(new DefaultComboBoxModel(new String[] {"School u go 2 !", "CHHS", "Pearson", "Western", "Bishop carol", "Other"}));
		School.setBounds(214, 103, 118, 35);
		panel.add(School);
		
		
		JTextArea Disp = new JTextArea();
		Disp.setBounds(44, 169, 288, 84);
		panel.add(Disp);
		
		JLabel Ing = new JLabel("");
		Ing.setBounds(44, 264, 288, 227);
		panel.add(Ing);
		
		
		lnt = new JTextField();
		lnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				lnt.setText("");
				
			}
		});
		lnt.setForeground(new Color(128, 128, 128));
		lnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lnt.setText("Last name");
		lnt.setColumns(10);
		lnt.setBounds(214, 57, 118, 35);
		panel.add(lnt);
		
		JButton Submit = new JButton("Submit !");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Grade = " ";
				String Schools = " ";
				String fn = fnt.getText();
				String ln = lnt.getText();
				
				if (Grades.getSelectedItem().equals("10"))
				{
					Grade = "10";
				}
				else if(Grades.getSelectedItem().equals("11"))
				{
					Grade = "11";
				}
				else 
				{
					Grade = "12";
				}
					
				
				
				
				if (School.getSelectedItem().equals("CHHS"))
				{
					Schools = "CHHS";
					Ing.setIcon(CHHS);
				}
				else if(School.getSelectedItem().equals("Pearson"))
				{
					Schools = "Pearson";
					Ing.setIcon(Pearson);
				}
				else 
				{
					Schools = "Western";
					Ing.setIcon(Western);
				}
				
				
				Disp.setText
				(
				fn + " " + ln +" is in grade " + Grade + " and goes to " + Schools + "."
				
				
				);
				
				
			}
		});
		Submit.setBackground(new Color(128, 128, 64));
		Submit.setForeground(new Color(255, 0, 0));
		Submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Submit.setBounds(365, 58, 111, 266);
		panel.add(Submit);
		
		
		
		

		
	}
}
