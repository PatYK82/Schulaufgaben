package model;

public class TaxiMain {

	public static void main(String[] args) {
		
		KundenInfo info = new KundenInfo();
		
		System.out.println("Netto: " + info.getNetto("Strechlimosine",false,true,true,15,5));
		System.out.println("Brutto: " + info.getBrutto("Strechlimosine",false,true,true,15,5));
		System.out.println("Steuer: " + info.getSteuer("Strechlimosine",false,true,true,15,5));

	}

	
}
