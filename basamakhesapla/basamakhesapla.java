package basamakhesapla;

import java.util.Scanner;

public class basamakhesapla {
    public static void main(String[] args) {

        int sayac = 0;
        System.out.println("Bir sayi girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        while (veri != 0) {
            veri = veri / 10;
            sayac++;

        }
        System.out.println("Basamak sayisi => " + sayac); // deger ekrana yazdırılıyor
    }
}
