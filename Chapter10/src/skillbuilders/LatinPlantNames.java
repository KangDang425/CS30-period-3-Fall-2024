package skillbuilders;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class LatinPlantNames {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
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
		
		String[] names = {"basil","lavender","parsley","peppermint","saffron","sage"};
		
		
		
		
		
		
		JLabel dontcareboutme2 = new JLabel("choose plant name");
		dontcareboutme2.setBounds(61, 38, 114, 14);
		panel.add(dontcareboutme2);
		
		JLabel dontcareboutme = new JLabel("Plant name");
		dontcareboutme.setBounds(202, 63, 86, 14);
		panel.add(dontcareboutme);
		
		JLabel latinPlantname = new JLabel("Ocimum");
		latinPlantname.setBounds(202, 88, 222, 33);
		panel.add(latinPlantname);
		
		
		JComboBox plantNames = new JComboBox(names);
		plantNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String) plantNames.getSelectedItem(); 
				
				
				if (name == "basil") {
					latinPlantname.setText("Ocimum");
				} else if (name == "lavender") {
					latinPlantname.setText("Laandula spica");
				} else if (name == "parsley") {
					latinPlantname.setText("apium");
				} else if (name == "peppermint") {
					latinPlantname.setText("Mentha piperita");
				} else if (name == "saffron") {
					latinPlantname.setText("crocus");
				} else if (name == "sage") {
					latinPlantname.setText("salvia");
					
				}
				
				
				
			}
		});
		
		plantNames.setModel(new DefaultComboBoxModel(new String[] {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		plantNames.setSelectedIndex(0);
		plantNames.setToolTipText("");
		plantNames.setBounds(61, 54, 114, 33);
		panel.add(plantNames);
		
		
		
		}
	}

