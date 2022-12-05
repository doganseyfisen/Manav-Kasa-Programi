import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {
		
		int armut, domates, elma, muz, patlıcan;
		double odemeTutarı;
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç kilo armut aldınız?: ");
		armut = input.nextInt();
		System.out.print("Kaç kilo domates aldınız?: ");
		domates = input.nextInt();
		System.out.print("Kaç kilo elma aldınız?: ");
		elma = input.nextInt();
		System.out.print("Kaç kilo muz aldınız?: ");
		muz = input.nextInt();
		System.out.print("Kaç kilo patlıcan aldınız?: ");
		patlıcan = input.nextInt();
		
		odemeTutarı = (armut * 2.14)+(domates * 1.11)+(elma * 3.67)+(muz * 0.95)+(patlıcan * 5);
		System.out.println("Ödemeniz gereken toplam tutar: "+ odemeTutarı + " TL");
		}
	}
