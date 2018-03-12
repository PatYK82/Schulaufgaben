package conrtoler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

import model.KundenInfo;
import view.KundenInfoView;

public class Controler implements ActionListener{
	
	private  KundenInfo model;
	private  KundenInfoView view;
	
	public Controler() {
		
	}
	public Controler(KundenInfo model, KundenInfoView view) {
		this.model = model;
		this.view = view;	
		}
	@Override
	public  void actionPerformed(ActionEvent e) {
		//bye();
		JComboBox cb = (JComboBox)e.getSource();
		String fahrzeugtyp = (String)cb.getSelectedItem();
		
		
		
	
	}
	public void bye() {
		System.exit(0);
	}
	public void reset() {
		
	}
	public void isChecked() {
		
	}
	public void addActioncomboBox() {
		
	}
	//public double getBerechnungen() {
		//String eingabe1 = view.getTxtDisplayEnt().getText();
		//String eingabe2 = view.getTxtDisplayFgaeste().getText();
	//}
}
