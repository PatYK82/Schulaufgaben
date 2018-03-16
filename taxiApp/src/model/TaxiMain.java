package model;

public class TaxiMain {

	public static void main(String[] args) {
		
		TaxiAppModel info = new TaxiAppModel(15,5, "Strechlimosine");
		info.setBar(true);
		info.setNachtzuschlag(true);
		
		System.out.println("Nettobetrag: " + info.getNetto());
		System.out.println("Mehrwertsteuer: " + info.getSteuer());
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Bruttobetrag: " + info.getBrutto());
		
		

	}

	
}
