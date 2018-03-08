package swingTachenrechner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator{

	private JFrame frame;
	private JTextField txtDisplay1;
	private JTextField txtDisplay2;
	private JTextField txtAntwort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JButton btnPlus;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 225);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tachenrechner");
		frame.getContentPane().setLayout(null);
		
		JLabel labelZahl1 = new JLabel("Zahl1");
		labelZahl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelZahl1.setBounds(10, 26, 45, 14);
		frame.getContentPane().add(labelZahl1);
		
		JLabel labelZahl2 = new JLabel("Zahl2");
		labelZahl2.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelZahl2.setBounds(10, 55, 45, 14);
		frame.getContentPane().add(labelZahl2);
		
		txtDisplay1 = new JTextField();
		txtDisplay1.setBounds(65, 11, 75, 29);
		frame.getContentPane().add(txtDisplay1);
		txtDisplay1.setColumns(10);
		
		txtDisplay2 = new JTextField();
		txtDisplay2.setBounds(65, 49, 75, 29);
		frame.getContentPane().add(txtDisplay2);
		txtDisplay2.setColumns(10);
		
		JButton btnMal = new JButton("*");
		btnMal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMal.addActionListener(calculate);
		btnMal.setBounds(154, 49, 56, 29);
		frame.getContentPane().add(btnMal);
		
		
		JButton btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double zahl1 = Double.parseDouble(txtDisplay1.getText());
				double zahl2 = Double.parseDouble(txtDisplay2.getText());
				double ergebnis = zahl1 / zahl2;
				txtAntwort.setText("" +ergebnis);
				double antwort = Double.parseDouble(txtAntwort.getText());
				
			}
		});
		btnDivision.setBounds(220, 49, 56, 29);
		frame.getContentPane().add(btnDivision);
		
		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double zahl1 = Double.parseDouble(txtDisplay1.getText());
				double zahl2 = Double.parseDouble(txtDisplay2.getText());
				double ergebnis = zahl1 + zahl2;
				String anwort = String.format("%.2f", ergebnis);
				
				txtAntwort.setText(anwort);	
				}
		});
		btnPlus.setBounds(154, 11, 56, 29);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double zahl1 = Double.parseDouble(txtDisplay1.getText());
				double zahl2 = Double.parseDouble(txtDisplay2.getText());
				double ergebnis = zahl1 - zahl2;
				txtAntwort.setText("" +ergebnis);
				double antwort = Double.parseDouble(txtAntwort.getText());
			}
		});
		btnMinus.setBounds(220, 11, 56, 29);
		frame.getContentPane().add(btnMinus);
		
		txtAntwort = new JTextField();
		txtAntwort.setBounds(10, 89, 130, 29);
		frame.getContentPane().add(txtAntwort);
		txtAntwort.setColumns(10);
		
		JButton btnNeu = new JButton("Neu");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay1.setText("");
				txtDisplay2.setText("");
				txtAntwort.setText("");
			}
		});
		btnNeu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNeu.setBounds(154, 92, 122, 23);
		frame.getContentPane().add(btnNeu);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(154, 126, 122, 23);
		frame.getContentPane().add(btnEnde);
		
		
		
	}
	private void actionPerformed(ActionEvent arg0) {
		
	}
	
	private ActionListener calculate = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton sender = (JButton) arg0.getSource();
			
			if(sender == btnPlus) {
				double zahl1 = Double.parseDouble(txtDisplay1.getText());
				double zahl2 = Double.parseDouble(txtDisplay2.getText());
				double ergebnis = zahl1 + zahl2;
				txtAntwort.setText("" +ergebnis);
				double antwort = Double.parseDouble(txtAntwort.getText());
				
			}
		}
	};
}
