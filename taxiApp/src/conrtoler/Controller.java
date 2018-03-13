package conrtoler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import model.KundenInfo;
import view.KundenInfoView;

public class Controller implements ActionListener{
	
	private  KundenInfo model;
	private  KundenInfoView view;
	
	public Controller() {
		
	}
	public Controller(KundenInfo model, KundenInfoView view) {
		this.model = model;
		this.view = view;	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton source = (JButton) e.getSource();
		
		if(source == KundenInfoView.getBtnBerechnen()) {
			
		}
		else if(source == KundenInfoView.getBtnDruecken()) {
			
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


}
