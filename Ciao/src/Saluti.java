import java.util.Scanner;
public class Saluti {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);     //per inserire il cin, bisogna mettere scanner che e' un oggetto che ci permette poi di inserire il "cin"
		System.out.println("Inserisci il nome della persona");   //output
		String nome=in.nextLine();   // il nextline serve per leggere le stringhe
		System.out.println("ciaooo0o"+" "+nome);
		System.out.println("inserisci l'eta' ");
		int eta=in.nextInt();    //nextint serve per leggere i numeri
		System.out.println("la tua eta' e' "+" "+eta);
	}

}
