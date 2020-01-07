public class Konversi{
	public static void main (String[] args){	
		int Kg = 1, Pon = 1; 
		
		for(int i=0; i<100; i++){
			Pon = Kg * 2;
			System.out.println (Kg++ + "Kg = " +Pon++ + "Pon");
		}	
	}
}