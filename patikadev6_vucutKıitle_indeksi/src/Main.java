import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double kilo, boy, indeks;
		
		System.out.println("Lütfen boyununuz (metre) cinsinden giriniz: ");
		boy = scan.nextDouble();
		
		System.out.println("Lütfen kilonuzu girin: ");
		kilo = scan.nextDouble();
		
		indeks = kilo / (boy*boy);
		
		System.out.println("Vücut Kitle İndeksiniz: " + indeks);
	}

}
