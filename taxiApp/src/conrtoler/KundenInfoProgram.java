package conrtoler;
import java.awt.EventQueue;

import javax.swing.JFrame;

import view.KundenInfoView;

public class KundenInfoProgram {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				KundenInfoView kundenInfoView = new KundenInfoView("Taxi");
				kundenInfoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				kundenInfoView.setVisible(true);
				
					
			}
		});
	}

}
