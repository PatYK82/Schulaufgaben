package taxiappinterface;

public interface TaxiAppPresenterInterface {
	
	TaxiAppModelInterface getTaxiModel();
	TaxiAppViewInterface getTaxiView();
	void setTaxiModel(TaxiAppModelInterface model);
	void setTaxiView(TaxiAppViewInterface view);
	void run(); 

}
