package masteries;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.SwingConstants;
import java.awt.Font;


public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon plates = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\plates.gif");
		ImageIcon plates2 = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\plates_two_broken.gif");
		ImageIcon platesA = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\plates_all_broken.gif");
		ImageIcon sticker = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\sticker.gif");
		ImageIcon tiger = new ImageIcon("C:\\Users\\27355005\\git\\CS30-period-3-Fall-2024\\Chapter10\\src\\images\\tiger_plush.gif");
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel plate2 = new JLabel("");
		plate2.setBounds(78, 32, 270, 78);
		panel.add(plate2);
		plate2.setIcon(plates);
		
		JLabel prize = new JLabel("Prizes ");
		prize.setFont(new Font("Tahoma", Font.PLAIN, 14));
		prize.setHorizontalAlignment(SwingConstants.CENTER);
		prize.setBounds(96, 204, 252, 101);
		panel.add(prize);
		
		Random rand = new Random();
		
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rand_int1 = rand.nextInt(3);
				if( rand_int1 == 1) {
					plate2.setIcon(plates2);
					prize.setIcon(sticker);
					prize.setText("Sticker!");
				}
				else if (rand_int1 == 2)
				{
					plate2.setIcon(platesA);
					prize.setIcon(tiger);
					prize.setText("Tiger!");
				}
				Play.setText("Play again!");
				
				
			}
		});
		Play.setBounds(152, 121, 111, 50);
		panel.add(Play);
		
		
		
		
	}
}
