package model;

import conrtoler.Controller;
import view.KundenInfoView;

public class KundenInfo {
	
	
	private static final double ANFAHRTPAUSCHAL = 3.90;
	private static final double NORMALESTAXIKILOMETERPREIS = 0.50;
	private static final double GROSSRAUMTAXIKILOMETERPREIS = 1;
	private static final double STRECHLIMOSINEKILOMETERPREIS = 2;
	private static final double NACHTZUSCHLAGPROKILOMETER = 0.1;
	private static final double MEHRWERTSTEUER = 0.07;
	private static final double BARPREIS = 15;
	private static final double KINDERSITZPREIS = 1;
	private KundenInfoView kundenInfoView;
	private Controller controller;
	
	
	public KundenInfo() {
	
	}

public double getMehrwertsteuer() {
		return MEHRWERTSTEUER;
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

	public double getBrutto(String fahrzeugtyp, boolean kindersitz, boolean nachtzuschlag, 
			boolean bar, double strecke, int anzahlFahrgaeste) {
		
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
		double betrag = ANFAHRTPAUSCHAL + streckenPreis*strecke;
		
		if(kindersitz)
			betrag += KINDERSITZPREIS;
		if(nachtzuschlag)
			streckenPreis *= NACHTZUSCHLAGPROKILOMETER   ;
		if(bar) 
			betrag += anzahlFahrgaeste * BARPREIS;
		
	
		return betrag;
	}
	public double getSteuer(String fahrzeugtyp, boolean kindersitz, boolean nachtzuschlag, 
			boolean bar, double strecke, int anzahlFahrgaeste) {
		
		double mehrwertsteur = getBrutto(fahrzeugtyp,kindersitz,nachtzuschlag,
				bar,strecke,anzahlFahrgaeste)*MEHRWERTSTEUER;
		return mehrwertsteur;
	}
	public double getNetto(String fahrzeugtyp, boolean kindersitz, boolean nachtzuschlag, 
			boolean bar, double strecke, int anzahlFahrg‰ste) {
		
		double netto = getBrutto(fahrzeugtyp,kindersitz,nachtzuschlag,bar,strecke, anzahlFahrg‰ste) - 
				getSteuer(fahrzeugtyp,kindersitz,nachtzuschlag,
				bar,strecke,anzahlFahrg‰ste);
		return netto;
	}
	
	
	

}
