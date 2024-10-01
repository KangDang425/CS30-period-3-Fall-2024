package masteries;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

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
	
	Bank easySave = new Bank();

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
		
		
		
		acctNum = new JTextField();
		acctNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acctNum.setText("");
			}
		});
		acctNum.setText("Account number ");
		acctNum.setBounds(57, 108, 483, 22);
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
		amt.setBounds(57, 156, 483, 22);
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
		fname.setBounds(57, 202, 483, 22);
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
		lname.setBounds(57, 255, 483, 22);
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
		bgBalance.setBounds(57, 307, 483, 22);
		panel.add(bgBalance);
		
		JLabel actinfo = new JLabel("");
		actinfo.setBounds(163, 357, 377, 27);
		panel.add(actinfo);
		
		JLabel dontcare = new JLabel("Account number");
		dontcare.setBounds(57, 88, 483, 14);
		panel.add(dontcare);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(57, 141, 483, 14);
		panel.add(lblAmount);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(57, 189, 483, 14);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(57, 241, 483, 14);
		panel.add(lblLastName);
		
		JLabel lblBeginingBalance = new JLabel("Begining Balance");
		lblBeginingBalance.setBounds(57, 288, 483, 14);
		panel.add(lblBeginingBalance);
		
		
		JComboBox BankAct = new JComboBox();
		BankAct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BankAct.getSelectedIndex()==1)
				{
					dontcare.setForeground(Color.red);
					lblAmount.setForeground(Color.red);
					lblFirstName.setForeground(Color.black);
					lblLastName.setForeground(Color.black);
					lblBeginingBalance.setForeground(Color.black);
				}
				else if (BankAct.getSelectedIndex()==2)
				{
					dontcare.setForeground(Color.red);
					lblAmount.setForeground(Color.red);
					lblFirstName.setForeground(Color.black);
					lblLastName.setForeground(Color.black);
					lblBeginingBalance.setForeground(Color.black);
				}
				else if (BankAct.getSelectedIndex()==3)
				{
					dontcare.setForeground(Color.red);
					lblAmount.setForeground(Color.black);
					lblFirstName.setForeground(Color.black);
					lblLastName.setForeground(Color.black);
					lblBeginingBalance.setForeground(Color.black);
				}
				else if (BankAct.getSelectedIndex()==4)
				{
					dontcare.setForeground(Color.black);
					lblAmount.setForeground(Color.black);
					lblFirstName.setForeground(Color.red);
					lblLastName.setForeground(Color.red);
					lblBeginingBalance.setForeground(Color.red);
				}
				else if (BankAct.getSelectedIndex()==5)
				{
					dontcare.setForeground(Color.red);
					lblAmount.setForeground(Color.black);
					lblFirstName.setForeground(Color.black);
					lblLastName.setForeground(Color.black);
					lblBeginingBalance.setForeground(Color.black);
				}
				
			}
			
			
		});
		BankAct.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BankAct.setModel(new DefaultComboBoxModel(new String[] {"Select an Item", "Deposit", "Withdrawal", "Check balance", "Add an account", "Remove an account"}));
		BankAct.setBounds(57, 41, 483, 22);
		panel.add(BankAct);
		
		
		JButton ahhadlkjdf = new JButton("Process transaction");
		ahhadlkjdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String amount, message;
				
				if(BankAct.getSelectedItem().equals("Deposit")) 
				{
					amount = amt.getText();
					message = easySave.transaction(1, acctNum.getText(), Double.parseDouble(amount));
					actinfo.setText(message);
				} 
				else if(BankAct.getSelectedItem().equals("Withdrawal")) 
				{
					amount = amt.getText();
					message = easySave.transaction(2, acctNum.getText(), Double.parseDouble(amount));
					actinfo.setText(message);
				}
				else if(BankAct.getSelectedItem().equals("Check balance"))
				{
					message = easySave.checkBalance(acctNum.getText());
					actinfo.setText(message);
				}
				else if(BankAct.getSelectedItem().equals("Add an account"))
				{
					amount = bgBalance.getText();
					message = easySave.addAccount( Double.parseDouble(amount), fname.getText(), lname.getText());
					actinfo.setText("New account ID is " + message);
					
				}
				else if(BankAct.getSelectedItem().equals("Remove an account"))
				{
					amount = amt.getText();
					message = easySave.deleteAccount(acctNum.getText());
					actinfo.setText("Account ID deleted is " + acctNum.getText());
				}
				
				acctNum.setText(null);
				amt.setText(null);
				fname.setText(null);
				lname.setText(null);
				bgBalance.setText(null);
				
				
			}
		});
		ahhadlkjdf.setBounds(24, 382, 140, 36);
		panel.add(ahhadlkjdf);
		
		
		
		
	}
}
