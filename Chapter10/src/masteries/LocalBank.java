package masteries;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LocalBank {

	private JFrame frame;
	private JTextField acctNum;
	private JTextField amt;
	private JTextField fname;
	private JTextField lname;
	private JTextField bgBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 602, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox BankAct = new JComboBox();
		BankAct.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BankAct.setModel(new DefaultComboBoxModel(new String[] {"Select an Item"}));
		BankAct.setBounds(57, 41, 483, 22);
		panel.add(BankAct);
		
		acctNum = new JTextField();
		acctNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acctNum.setText("");
			}
		});
		acctNum.setText("Account number ");
		acctNum.setBounds(57, 98, 483, 22);
		panel.add(acctNum);
		acctNum.setColumns(10);
		
		amt = new JTextField();
		amt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				amt.setText("");

			}
		});
		amt.setText("Amount");
		amt.setColumns(10);
		amt.setBounds(57, 144, 483, 22);
		panel.add(amt);
		
		fname = new JTextField();
		fname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fname.setText("");
			}
		});
		fname.setText("First name");
		fname.setColumns(10);
		fname.setBounds(57, 192, 483, 22);
		panel.add(fname);
		
		lname = new JTextField();
		lname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lname.setText("");
			}
		});
		lname.setText("Last name");
		lname.setColumns(10);
		lname.setBounds(57, 236, 483, 22);
		panel.add(lname);
		
		bgBalance = new JTextField();
		bgBalance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bgBalance.setText("");
			}
		});
		bgBalance.setText("Begining balance");
		bgBalance.setColumns(10);
		bgBalance.setBounds(57, 290, 483, 22);
		panel.add(bgBalance);
		
		JLabel actinfo = new JLabel("");
		actinfo.setBounds(163, 333, 377, 27);
		panel.add(actinfo);
		
		JButton ahhadlkjdf = new JButton("Process transaction");
		ahhadlkjdf.setBounds(24, 382, 127, 22);
		panel.add(ahhadlkjdf);
		
		
	}
}
