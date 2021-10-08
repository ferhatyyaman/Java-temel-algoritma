package Negatifpozitifbulma;

import java.util.Scanner;

public class Negatifpozitifbulma {

	public static void main(String[] args) {
		System.out.println("bir sayi giriniz"); // kullanıcı sayı giriyor
		Scanner verial = new Scanner(System.in); // nesne oluşturuldu
		int veri = verial.nextInt(); // girilen deger alınıyor

		if (veri < 0) {
			System.out.println("negatif deger girdin = " + veri); // deger ekrana yazdırılıyor
		} else {
			System.out.println("pozitif deger deger girdin = " + veri); // deger ekrana yazdırılıyor
		}

	}

}