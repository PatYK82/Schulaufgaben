package taxiApppresenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import model.TaxiAppModel;
import taxiAppView.TaxiAppView;
import taxiappinterface.TaxiAppModelInterface;
import taxiappinterface.TaxiAppPresenterInterface;
import taxiappinterface.TaxiAppViewInterface;

public class TaxiAppPresenter implements TaxiAppPresenterInterface{
	
	private  TaxiAppModelInterface model;
	private  TaxiAppViewInterface view;
	
	@Override
	public TaxiAppModelInterface getTaxiModel() {
		return model;
	}
	@Override
	public TaxiAppViewInterface getTaxiView() {
		return view;
	}
	
	@Override
	public void setTaxiModel(TaxiAppModelInterface model) {
		this.model = model;
	}
	
	@Override
	public void setTaxiView(TaxiAppViewInterface view) {
		this.view = view;
	}

	/**public Controller() {
		
	}
	public Controller(KundenInfo model, KundenInfoView view) {
		this.model = model;
		this.view = view;	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton source = (JButton) e.getSource();
		
		if(source == KundenInfoView.getBtnBerechnen()) {
			model.getBrutto(KundenInfoView.getComboAuswahlFarzeug().getSelectedItem(),
					KundenInfoView.getCbKindersitz(), KundenInfoView.getCbNacht(), KundenInfoView.getCbBar(), 
					KundenInfoView.getTxtEntfernung().getText(), KundenInfoView.getTxtDisplayFgaeste().getText());
			
			//model.getNetto(fahrzeugtyp, kindersitz, nachtzuschlag, bar, strecke, anzahlFahrgäste);
			//model.getMehrwertsteuer();
		}
		else if(source == KundenInfoView.getBtnDrucken()) {
			
		}
		else if(source == KundenInfoView.getBtnNeu()) {
			
		}
		else if(source == KundenInfoView.getBtnEnde()) {
			System.exit(0);
		}
	
	}
	
	public void itemStateChanged(ItemEvent e) {
		JCheckBox source =(JCheckBox) e.getItemSelectable();
		if(source == KundenInfoView.getCbNacht()) {
			
		}
		else if(source == KundenInfoView.getCbKindersitz()) {
			
		}
		else if(source == KundenInfoView.getCbBar()) {
			
		}
	}
*/

}
