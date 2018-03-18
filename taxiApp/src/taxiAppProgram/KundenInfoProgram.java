package taxiAppProgram;
import java.awt.EventQueue;
import javax.swing.JFrame;

import model.TaxiAppModel;
import taxiAppView.TaxiAppView;
import taxiApppresenter.TaxiAppPresenter;
import taxiappinterface.TaxiAppModelInterface;
import taxiappinterface.TaxiAppPresenterInterface;
import taxiappinterface.TaxiAppViewInterface;

public class KundenInfoProgram {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				TaxiAppModelInterface taxiAppModel = new TaxiAppModel(15,5,"Stechlimosine");
				TaxiAppPresenterInterface taxiAppPresenter = new TaxiAppPresenter();
				taxiAppPresenter.setTaxiModel(taxiAppModel);
				TaxiAppViewInterface taxiAppView = new TaxiAppView();
				taxiAppPresenter.setTaxiView(taxiAppView);
				//taxiAppView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//taxiAppView.setVisible(true);
				
					
			}
		});
	}

}
