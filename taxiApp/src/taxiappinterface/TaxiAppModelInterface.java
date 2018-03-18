package taxiappinterface;

public interface TaxiAppModelInterface {
	
	double getEntfernung();
	void setEntfernung(double entfernung);
	double getFahrgaeste();
	void setFahrgaeste(double fahrgaeste);
	String getFahrzeugtyp();
	void setFahrzeugtyp(String fahrzeugtyp);
	boolean isKindersitz();
	void setKindersitz(boolean kindersitz);
	boolean isNachtzuschlag();
	void setNachtzuschlag(boolean nachtzuschlag);
	boolean isBar();
	void setBar(boolean bar);
	double getMehrwertsteuer();
	
	double getBrutto();
	double getNetto();
	double getSteuer();
	void setBrutto(double bruttobetrag);
	void setNetto(double nettobetrag);
	void setSteuer(double mehrwertsteuer);
	

}
