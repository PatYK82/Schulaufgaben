package taxiappinterface;

public interface TaxiAppViewInterface {
	
	TaxiAppPresenterInterface getPresenter();
	void setPresenter(TaxiAppPresenterInterface taxiPresenter);
	void updateModelFromView();
	void updateViewFromModel();

}
