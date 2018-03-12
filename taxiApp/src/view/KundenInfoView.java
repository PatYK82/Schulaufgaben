package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import conrtoler.Controler;
import model.KundenInfo;
import javax.swing.border.EtchedBorder;

public class KundenInfoView extends JFrame{
	
	
	private static JTextField txtDisplayEnt,txtBrutto,
	txtMSteuer,txtNetto,txtDisplayFgaeste, txtEntfernung;
	private static JLabel lbAuswahl,lbEntfernung,lbFahrgaeste,lbNetto,lbMWSteuer,lbBrutto;
	private static KundenInfo kundeninfo;
	private static JPanel panelEingabe,panelRechnungsübersicht;
	private static ButtonGroup bg;
	private static JCheckBox cbNacht,cbKindersitz,cbBar;	
	private static JComboBox comboAuswahlFarzeug;
	private static JButton btnBerechnen,btnDruecken,btgnNeu,btnEnde;
	private static final int FRAME_WIDTH = 480;
	private static final int FRAME_HEIGHT = 450;
	private static Controler controler;
	private static String title;
	
	
	
    

	public static JComboBox getComboAuswahlFarzeug() {
		return comboAuswahlFarzeug;
	}

	public KundenInfoView() {

    	super("Taxi");
    	kundeninfo = new KundenInfo();
    	createTextFields();
    	createLabels();
    	createCheckBox();
    	createButtons();
    	createPanels();
    	setSize(480, 429);
    	setResizable(false);
    	setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        getContentPane().setLayout(null);
        getContentPane().add(panelEingabe);
        getContentPane().add(panelRechnungsübersicht);
        txtMSteuer = new JTextField();
        txtMSteuer.setEditable(false);
        txtMSteuer.setBounds(169, 61, 115, 20);
        panelRechnungsübersicht.add(txtMSteuer);
        txtNetto = new JTextField();
        txtNetto.setEditable(false);
        txtNetto.setBounds(169, 30, 115, 20);
        panelRechnungsübersicht.add(txtNetto);
        txtBrutto = new JTextField();
        txtBrutto.setEditable(false);
        txtBrutto.setBounds(169, 110, 115, 20);
        panelRechnungsübersicht.add(txtBrutto);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(27, 97, 257, 2);
        panelRechnungsübersicht.add(separator);
 
    	getContentPane().add(btnBerechnen);
    	getContentPane().add(btnDruecken);
    	getContentPane().add(btgnNeu);
    	getContentPane().add(btnEnde);
				

	}
    
    private static void createTextFields() {
    	
       	txtDisplayEnt = new JTextField();
       	txtDisplayEnt.addActionListener(controler);
        txtEntfernung  = new JTextField();
        txtDisplayFgaeste  = new JTextField();
        txtDisplayFgaeste.setBounds(366, 163, 38, 23);
        txtDisplayFgaeste.addActionListener(controler);

    }
    private static void createLabels() {
    	lbEntfernung = new JLabel("Entfehrnung in km");
    	lbEntfernung.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lbEntfernung.setBounds(27, 63, 141, 23);
    	lbFahrgaeste = new JLabel("Fahrgaeste");
    	lbFahrgaeste.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lbFahrgaeste.setBounds(282, 160, 74, 29);
    	lbNetto = new JLabel("Nettobetrag");
    	lbNetto.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lbNetto.setBounds(27, 30, 109, 20);
    	lbMWSteuer = new JLabel("Mehrwersteuer");
    	lbMWSteuer.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lbMWSteuer.setBounds(27, 61, 109, 20);
    	lbBrutto = new JLabel("Bruttobetrag");
    	lbBrutto.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lbBrutto.setBounds(27, 116, 79, 20);
    	
    	lbBrutto = new JLabel("Bruttobetrag");
    	lbBrutto.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lbBrutto.setBounds(27, 110, 79, 20);
    	
        lbAuswahl = new JLabel("Auswahl des Fahrzeugstyps");
        lbAuswahl.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbAuswahl.setBounds(27, 30, 178, 20);

    	
    }
    
    private static void createCheckBox() {
        cbBar = new JCheckBox("Bar (Zuschlag 15€)");
        cbBar.setFont(new Font("Tahoma", Font.BOLD, 11));
        cbBar.setBounds(27, 119, 141, 15);
        cbKindersitz = new JCheckBox("Kindersitz (Zuschlag 1 €)");
        cbKindersitz.setFont(new Font("Tahoma", Font.BOLD, 11));
        cbKindersitz.setBounds(27, 137, 178, 25);
    }
    
    private static void createButtons() {
    	btnBerechnen = new JButton("Berechenen");
        controler = new Controler();
    	//btnBerechnen.addActionListener();
    	btnBerechnen.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnBerechnen.setBounds(314, 240, 133, 23);
    	btnDruecken = new JButton("Drucken");
    	btnDruecken.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnDruecken.setBounds(314, 284, 133, 23);
    	btgnNeu = new JButton("Neu");
    	btgnNeu.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btgnNeu.setBounds(314, 318, 133, 23);
    	btnEnde = new JButton("Ende");
    	btnEnde.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnEnde.setBounds(314, 353, 133, 23);
    	btnEnde.addActionListener(controler);
    
     }
    
	private static void createPanels() {
    	panelEingabe = new JPanel();
    	panelEingabe.setBounds(10, 22, 437, 200);
    	panelEingabe.setBorder(new TitledBorder(null, "Eingaben", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    	panelEingabe.setLayout(null);
    	panelRechnungsübersicht = new JPanel();
    	panelRechnungsübersicht.setBounds(10, 236, 294, 141);
    	panelRechnungsübersicht.setBorder(new TitledBorder(null, "Rechnungsübersicht", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    	panelRechnungsübersicht.setLayout(null);
    	
        String[] fahrzeugStyp = {"Normales Taxi", "Grosses Taxi", "Stechlimosine"};
    	comboAuswahlFarzeug = new JComboBox(fahrzeugStyp);
    	comboAuswahlFarzeug.setSelectedIndex(2);
    	comboAuswahlFarzeug.setBounds(242, 30, 162, 23);
    	comboAuswahlFarzeug.addActionListener(controler);
    	panelEingabe.add(lbEntfernung);
    	cbNacht = new JCheckBox("Nachtfahrt (Zuschlag 10 %)");
    	cbNacht.setFont(new Font("Tahoma", Font.BOLD, 11));
    	cbNacht.setBounds(27, 93, 194, 23);
    	panelEingabe.add(cbNacht);
    	panelEingabe.add(cbKindersitz);
    	panelEingabe.add(cbBar);
    	panelEingabe.add(lbFahrgaeste);
    	panelEingabe.add(comboAuswahlFarzeug);
    	panelEingabe.add(txtEntfernung);
    	panelEingabe.add(lbAuswahl);
    	panelEingabe.add(txtDisplayFgaeste);
    	
    	panelRechnungsübersicht.setLayout(null);
    	panelRechnungsübersicht.add(lbNetto);
    	panelRechnungsübersicht.add(lbMWSteuer);
    	panelRechnungsübersicht.add(lbBrutto);
    
    	
    }

	public static JTextField getTxtDisplayEnt() {
		return txtDisplayEnt;
	}

	public static JTextField getTxtBrutto() {
		return txtBrutto;
	}

	public static JTextField getTxtMSteuer() {
		return txtMSteuer;
	}

	public static JTextField getTxtNetto() {
		return txtNetto;
	}

	public static JTextField getTxtDisplayFgaeste() {
		return txtDisplayFgaeste;
	}

	public static JTextField getTxtEntfernung() {
		return txtEntfernung;
	}

	public static JLabel getLbAuswahl() {
		return lbAuswahl;
	}

	public static JLabel getLbEntfernung() {
		return lbEntfernung;
	}

	public static JLabel getLbFahrgaeste() {
		return lbFahrgaeste;
	}

	public static JLabel getLbNetto() {
		return lbNetto;
	}

	public static JLabel getLbMWSteuer() {
		return lbMWSteuer;
	}

	public static JLabel getLbBrutto() {
		return lbBrutto;
	}

	public static KundenInfo getKundeninfo() {
		return kundeninfo;
	}

	public static JPanel getPanelEingabe() {
		return panelEingabe;
	}

	public static JPanel getPanelRechnungsübersicht() {
		return panelRechnungsübersicht;
	}

	public static JCheckBox getCbNacht() {
		return cbNacht;
	}

	public static JCheckBox getCbKindersitz() {
		return cbKindersitz;
	}

	public static JCheckBox getCbBar() {
		return cbBar;
	}

	public static JButton getBtnBerechnen() {
		return btnBerechnen;
	}

	public static JButton getBtnDruecken() {
		return btnDruecken;
	}

	public static JButton getBtgnNeu() {
		return btgnNeu;
	}

	public static JButton getBtnEnde() {
		return btnEnde;
	}

	public static Controler getControler() {
		return controler;
	}

	public static void setComboAuswahlFarzeug(JComboBox comboAuswahlFarzeug) {
		KundenInfoView.comboAuswahlFarzeug = comboAuswahlFarzeug;
	}
	
	
   
}

