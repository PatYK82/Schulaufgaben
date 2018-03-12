package model;

import conrtoler.Controler;
import view.KundenInfoView;

public class KundenInfo {
	
	
	private static final double ANFAHRTPAUSCHAL = 3.90;
	private static final double NORMALESTAXIKILOMETERPREIS = 0.50;
	private static final double GROSSRAUMTAXIKILOMETERPREIS = 1;
	private static final double STRECHLIMOSINEKILOMETERPREIS = 2;
	private static final double NACHTZUSCHLAGPROKILOMETER = 0.1;
	private static final double MEHRWERTSTEUER = 1.7;
	private static final double BARPREIS = 15;
	private static final double KINDERSITZPREIS = 1;
	private static KundenInfoView kundenInfoView;
	private static Controler comtroler;
	
	
	public KundenInfo() {
	
	}

public static double getMehrwertsteuer() {
		return MEHRWERTSTEUER;
	}


	public static double getAnfahrtpauschal() {
		return ANFAHRTPAUSCHAL;
	}

	public static double getNormalestaxikilometerpreis() {
		return NORMALESTAXIKILOMETERPREIS;
	}

	public static double getGrossraumtaxikilometerpreis() {
		return GROSSRAUMTAXIKILOMETERPREIS;
	}

	public static double getStrechlimosinekilometerpreis() {
		return STRECHLIMOSINEKILOMETERPREIS;
	}

	public static double getNachtzuschlagprokilometer() {
		return NACHTZUSCHLAGPROKILOMETER;
	}

	public static double getBarpreis() {
		return BARPREIS;
	}

	public static double getKindersitzpreis() {
		return KINDERSITZPREIS;
	}

	public double getBrutto(String fahrzeugtyp, boolean kindersitz, boolean nachtzuschlag, 
			boolean bar, double strecke, int anzahlFahrg‰ste) {
		double streckenPreis = 0; 
		double betrag = ANFAHRTPAUSCHAL + streckenPreis* Double.parseDouble(kundenInfoView.getTxtDisplayEnt().getText());
		
		
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
	
		
		if(kindersitz)
			betrag += KINDERSITZPREIS;
		if(nachtzuschlag)
			streckenPreis *= NACHTZUSCHLAGPROKILOMETER   ;
		if(bar) 
			betrag += Double.parseDouble(kundenInfoView.getTxtDisplayFgaeste().getText()) * BARPREIS;
		
	
		return betrag;
	}
	public double getSteuer(String fahrzeugtyp, boolean kindersitz, boolean nachtzuschlag, 
			boolean bar, double strecke, int anzahlFahrg‰ste) {
		
		double mehrwertsteur = getBrutto(fahrzeugtyp,kindersitz,nachtzuschlag,
				bar,strecke,anzahlFahrg‰ste)*MEHRWERTSTEUER;
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
