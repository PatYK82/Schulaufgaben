package taxiAppProgram;
import java.awt.EventQueue;
import javax.swing.JFrame;
import taxiAppView.TaxiAppView;

public class KundenInfoProgram {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				TaxiAppView kundenInfoView = new TaxiAppView();
				kundenInfoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				kundenInfoView.setVisible(true);
				
					
			}
		});
	}

}
