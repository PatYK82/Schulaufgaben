package model;

public class TaxiMain {

	public static void main(String[] args) {
		
		KundenInfo info = new KundenInfo();
		
		System.out.println("Nettobetrag: " + info.getNetto("Strechlimosine",false,true,true,info.getBarpreis(),5));
		System.out.println("Mehrwertsteuer: " + info.getSteuer("Strechlimosine",false,true,true,15,5));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Bruttobetrag: " + info.getBrutto("Strechlimosine",false,true,true,15,5));
		
		

	}

	
}
