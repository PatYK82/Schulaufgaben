package model;

import taxiappinterface.TaxiAppModelInterface;

public class TaxiAppModel implements TaxiAppModelInterface{
	
	
	private static final double ANFAHRTPAUSCHAL = 3.90;
	private static final double NORMALESTAXIKILOMETERPREIS = 0.50;
	private static final double GROSSRAUMTAXIKILOMETERPREIS = 1;
	private static final double STRECHLIMOSINEKILOMETERPREIS = 2;
	private static final double NACHTZUSCHLAGPROKILOMETER = 0.1;
	private static final double MEHRWERTSTEUER = 0.07;
	private static final double BARPREIS = 15;
	private static final double KINDERSITZPREIS = 1;
	private double entfernung;
	private double fahrgaeste;
	private String fahrzeugtyp;
	private boolean kindersitz,nachtzuschlag,bar;
	private double bruttobetrag;
	private double nettobetrag;
	private double mehrwertsteuer;
	
	public double getEntfernung() {
		return entfernung;
	}

	public void setEntfernung(double entfernung) {
		this.entfernung = entfernung;
	}

	public double getFahrgaeste() {
		return fahrgaeste;
	}

	public void setFahrgaeste(double fahrgaeste) {
		this.fahrgaeste = fahrgaeste;
	}

	public String getFahrzeugtyp() {
		return fahrzeugtyp;
	}

	public void setFahrzeugtyp(String fahrzeugtyp) {
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public boolean isKindersitz() {
		return kindersitz;
	}

	public void setKindersitz(boolean kindersitz) {
		this.kindersitz = kindersitz;
	}

	public boolean isNachtzuschlag() {
		return nachtzuschlag;
	}

	public void setNachtzuschlag(boolean nachtzuschlag) {
		this.nachtzuschlag = nachtzuschlag;
	}

	public boolean isBar() {
		return bar;
	}

	public void setBar(boolean bar) {
		this.bar = bar;
	}

	public double getMehrwertsteuer() {
		return MEHRWERTSTEUER;
	}
	
	
	public TaxiAppModel(double entfernung, double fahrgaeste, String fahrzeugtyp){
		this.entfernung = entfernung;
		this.fahrgaeste = fahrgaeste;
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public double getAnfahrtpauschal() {
		return ANFAHRTPAUSCHAL;
	}
	
	public double getNormalestaxikilometerpreis() {
		return NORMALESTAXIKILOMETERPREIS;
	}
	
	public double getGrossraumtaxikilometerpreis() {
		return GROSSRAUMTAXIKILOMETERPREIS;
	}

	public double getStrechlimosinekilometerpreis() {
		return STRECHLIMOSINEKILOMETERPREIS;
	}
	
	public double getNachtzuschlagprokilometer() {
		return NACHTZUSCHLAGPROKILOMETER;
	}

	public double getBarpreis() {
		return BARPREIS;
	}
	
	public double getKindersitzpreis() {
		return KINDERSITZPREIS;
	}
	@Override
	public void setBrutto(double bruttobetrag) {
		this.bruttobetrag = bruttobetrag;
	}

	@Override
	public void setNetto(double nettobetrag) {
		this.nettobetrag = nettobetrag;
	}

	@Override
	public void setSteuer(double mehrwertsteuer) {
		this.mehrwertsteuer = mehrwertsteuer;
	}

	@Override
	public double getBrutto() {
		
		double streckenPreis = 0; 
		switch(fahrzeugtyp) {
			case "Normalestaxi": 
				streckenPreis = NORMALESTAXIKILOMETERPREIS;
				break;
			case "Groﬂraumtaxi":
				streckenPreis = GROSSRAUMTAXIKILOMETERPREIS;
				break;
			case "Strechlimosine":
				streckenPreis = STRECHLIMOSINEKILOMETERPREIS;
				break;
		}
		 bruttobetrag = ANFAHRTPAUSCHAL + streckenPreis*entfernung;
		
		if(kindersitz)
			bruttobetrag += KINDERSITZPREIS;
		if(nachtzuschlag)
			streckenPreis *= NACHTZUSCHLAGPROKILOMETER   ;
		if(bar) 
			bruttobetrag += fahrgaeste * BARPREIS;
		
	
		return bruttobetrag;
	}
	
	@Override
	public double getSteuer() {
		
		mehrwertsteuer = getBrutto()*MEHRWERTSTEUER;
		return mehrwertsteuer;
	}
	@Override
	public double getNetto() {
		
		nettobetrag = getBrutto() - getSteuer();
		return nettobetrag;
	}


	
	
	

}
