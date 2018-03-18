package taxiAppView;

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

import taxiappinterface.TaxiAppPresenterInterface;
import taxiappinterface.TaxiAppViewInterface;

import javax.swing.border.EtchedBorder;

public class TaxiAppView extends JFrame implements TaxiAppViewInterface, ActionListener{
	
	
	private JTextField txtDisplayEnt,txtBrutto,
	txtMSteuer,txtNetto,txtDisplayFgaeste, txtEntfernung;
	private JLabel lbAuswahl,lbEntfernung,lbFahrgaeste,lbNetto,lbMWSteuer,lbBrutto;
	private JPanel panelEingabe,panelRechnungsübersicht;
	private ButtonGroup bg;
	private JCheckBox cbNacht,cbBar,cbKindersitz;	
	private JComboBox comboAuswahlFarzeug;
	private JButton btnBerechnen,btnDrucken,btnNeu,btnEnde;
	private static final int FRAME_WIDTH = 480;
	private static final int FRAME_HEIGHT = 450;
	
	private TaxiAppPresenterInterface taxiPresenter;
	

	public TaxiAppView() {

    	super("Taxi");
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
        txtMSteuer.addActionListener(this);
        panelRechnungsübersicht.add(txtMSteuer);
        txtNetto = new JTextField();
        txtNetto.setEditable(false);
        txtNetto.setBounds(169, 30, 115, 20);
        txtNetto.addActionListener(this);
        panelRechnungsübersicht.add(txtNetto);
        txtBrutto = new JTextField();
        txtBrutto.setEditable(false);
        txtBrutto.setBounds(169, 110, 115, 20);
        txtBrutto.addActionListener(this);
        panelRechnungsübersicht.add(txtBrutto);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(27, 97, 257, 2);
        panelRechnungsübersicht.add(separator);
 
    	getContentPane().add(btnBerechnen);
    	getContentPane().add(btnDrucken);
    	getContentPane().add(btnNeu);
    	getContentPane().add(btnEnde);
				

	}
    
    private void createTextFields() {
    	
       	//txtDisplayEnt = new JTextField();
       	
        txtEntfernung  = new JTextField();
        txtEntfernung.setBounds(299, 63, 105, 23);
        txtEntfernung.setHorizontalAlignment(txtEntfernung.RIGHT);
        txtEntfernung.addActionListener(this);
        txtDisplayFgaeste  = new JTextField();
        txtDisplayFgaeste.setHorizontalAlignment(txtDisplayFgaeste.RIGHT);
        txtDisplayFgaeste.setBounds(366, 163, 38, 23);
        txtDisplayFgaeste.addActionListener(this);
      

    }
    private void createLabels() {
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
    
    private void createCheckBox() {
       
      
        cbBar = new JCheckBox();
        cbBar.setText("Bar (Zuschlag 15€)");
        cbBar.setFont(new Font("Tahoma", Font.BOLD, 11));
        cbBar.setBounds(27, 137, 178, 25);
        cbBar.setSelected(true);
        
        cbKindersitz = new JCheckBox();
        cbKindersitz.setText("Kindersitz (Zuschlag 1€)");
        cbKindersitz.setFont(new Font("Tahoma", Font.BOLD, 11));
        cbKindersitz.setBounds(27, 119, 170, 15);
        
        cbNacht = new JCheckBox();
        cbNacht.setText("Nachtfahrt (Zuschlag 10 %)");
    	cbNacht.setFont(new Font("Tahoma", Font.BOLD, 11));
    	cbNacht.setBounds(27, 93, 194, 23);
    	cbNacht.setSelected(true);
    	
    	
    }
    
    private void createButtons() {
    	
    	btnBerechnen = new JButton();
    	btnBerechnen.setText("Berechenen");
    	btnBerechnen.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnBerechnen.setBounds(314, 240, 133, 23);
    	btnBerechnen.addActionListener(this);
    	btnDrucken = new JButton();
    	btnDrucken.setText("Drucken");
    	btnDrucken.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnDrucken.setBounds(314, 284, 133, 23);
    	btnNeu = new JButton();
    	btnNeu.setText("Neu");
    	btnNeu.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnNeu.setBounds(314, 318, 133, 23);
    	btnNeu.addActionListener(this);
    	btnEnde = new JButton("Ende");
    	btnEnde.setText("Ende");
    	btnEnde.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnEnde.setBounds(314, 353, 133, 23);
    	btnEnde.addActionListener(this);
    
    
     }
    
	private void createPanels() {
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
    	panelEingabe.add(lbEntfernung);
    	
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

	public JTextField getTxtDisplayEnt() {
		return txtDisplayEnt;
	}

	public JTextField getTxtBrutto() {
		return txtBrutto;
	}

	public JTextField getTxtMSteuer() {
		return txtMSteuer;
	}

	public JTextField getTxtNetto() {
		return txtNetto;
	}

	public JTextField getTxtDisplayFgaeste() {
		return txtDisplayFgaeste;
	}

	public JTextField getTxtEntfernung() {
		return txtEntfernung;
	}

	public JLabel getLbAuswahl() {
		return lbAuswahl;
	}

	public JLabel getLbEntfernung() {
		return lbEntfernung;
	}

	public JLabel getLbFahrgaeste() {
		return lbFahrgaeste;
	}

	public JLabel getLbNetto() {
		return lbNetto;
	}

	public JLabel getLbMWSteuer() {
		return lbMWSteuer;
	}

	public JLabel getLbBrutto() {
		return lbBrutto;
	}

	public TaxiAppView getKundeninfo() {
		return getKundeninfo();
	}

	public JPanel getPanelEingabe() {
		return panelEingabe;
	}

	public JPanel getPanelRechnungsübersicht() {
		return panelRechnungsübersicht;
	}

	public JCheckBox getCbNacht() {
		return cbNacht;
	}

	public JCheckBox getCbKindersitz() {
		return cbBar;
	}

	public JCheckBox getCbBar() {
		return cbBar;
	}

	public JButton getBtnBerechnen() {
		return btnBerechnen;
	}

	public JButton getBtnDrucken() {
		return btnDrucken;
	}

	public JButton getBtnNeu() {
		return btnNeu;
	}

	public JButton getBtnEnde() {
		return btnEnde;
	}

	
	@Override
	public TaxiAppPresenterInterface getPresenter() {
		return taxiPresenter;
	}
	@Override
	public void setPresenter(TaxiAppPresenterInterface taxiPresenter) {
		this.taxiPresenter = taxiPresenter;
	}
	@Override
	public void updateModelFromView() {
		getPresenter().getTaxiModel().setEntfernung(Double.parseDouble(txtDisplayEnt.getText()));
		getPresenter().getTaxiModel().setFahrgaeste(Integer.parseInt(txtDisplayFgaeste.getText()));
		//getPresenter().getTaxiModel().setBar(cbBar);
		//getPresenter().getTaxiModel().setKindersitz(cbKindersitz);
		//getPresenter().getTaxiModel().setNachtzuschlag(cbNacht);
	}
	@Override
	public void updateViewFromModel() {
		
		txtBrutto.setText(String.valueOf(getPresenter().getTaxiModel().getBrutto()));
		txtNetto.setText(String.valueOf(getPresenter().getTaxiModel().getNetto()));
		txtMSteuer.setText(String.valueOf(getPresenter().getTaxiModel().getSteuer()));
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == btnEnde) {
			System.exit(0);
		}
		 else if(event.getSource() == btnBerechnen) {
			txtEntfernung.getText();
			txtDisplayFgaeste.getText();
			updateModelFromView();
			updateViewFromModel();
			//getPresenter().getTaxiModel().getBrutto();
			//getPresenter().getTaxiModel().getNetto();
			//getPresenter().getTaxiModel().getSteuer();
		}
		else if(event.getSource() == btnNeu) {
			
		}
		else if(event.getSource() == btnNeu) {
			btnNeu.setText("");
		}
		else if(event.getSource() == btnDrucken) {
			
		}
		
	}
	
   
}

