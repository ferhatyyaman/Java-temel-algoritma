package KordinatMesafeHesapalama;

import java.util.Scanner;

public class KordinatMesafeHesapalama {

	public static void main(String[] args) {

		System.out.println("1.noktaları giriniz :"); // kullanıcı sayı giriyor
		Scanner verial1 = new Scanner(System.in); // nesne oluşturuldu
		int x1 = verial1.nextInt(); // girilen deger alınıyor
		int y1 = verial1.nextInt(); // girilen deger alınıyo

		System.out.println("2.noktaları giriniz :"); // kullanıcı sayı giriyor
		Scanner verial2 = new Scanner(System.in); // nesne oluşturuldu
		int x2 = verial2.nextInt(); // girilen deger alınıyor
		int y2 = verial2.nextInt(); // girilen deger alınıyo

		float mesafeKare = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

		System.out.println("kordinat sonucu = " + Math.sqrt(mesafeKare)); // deger ekrana yazdırılıyor
	}

}