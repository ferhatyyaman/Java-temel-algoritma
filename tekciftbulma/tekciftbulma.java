package tekciftbulma;

import java.util.Scanner;

public class tekciftbulma { // girilen sayının cift mi tek mi oldugunu buluyoruz

    public static void main(String[] args) {
        System.out.println("bir sayi giriniz = "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        if (veri % 2 == 0)
            System.out.println("sayi cifttir: " + veri); // deger ekrana yazdırılıyor

        else
            System.out.println("sayi cifttir: " + veri);// deger ekrana yazdırılıyor
    }

}