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
	boolean kindersitz,nachtzuschlag,bar;
	
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

	public static double getMehrwertsteuer() {
		return MEHRWERTSTEUER;
	}
	
	
	TaxiAppModel(double entfernung, double fahrgaeste, String fahrzeugtyp){
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
		double betrag = ANFAHRTPAUSCHAL + streckenPreis*entfernung;
		
		if(kindersitz)
			betrag += KINDERSITZPREIS;
		if(nachtzuschlag)
			streckenPreis *= NACHTZUSCHLAGPROKILOMETER   ;
		if(bar) 
			betrag += fahrgaeste * BARPREIS;
		
	
		return betrag;
	}
	
	@Override
	public double getSteuer() {
		
		double mehrwertsteur = getBrutto()*MEHRWERTSTEUER;
		return mehrwertsteur;
	}
	@Override
	public double getNetto() {
		
		double netto = getBrutto() - 
				getSteuer();
		return netto;
	}
	
	
	

}
