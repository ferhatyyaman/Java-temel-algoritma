package asalsayi;

import java.util.Scanner;

public class asalsayi {
    public static void main(String[] args) {

        Boolean sayac = false;
        System.out.println("Bir sayi girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        for (int i = 2; i < veri; i++) {
            if (veri % i == 0) {
                sayac = true;
                break;
            }
        }
        if (sayac == false)
            System.out.println("asal sayidir"); // deger ekrana yazdırılıyor
        else
            System.out.println("asal sayi degildir"); // deger ekrana yazdırılıyor

    }

}
