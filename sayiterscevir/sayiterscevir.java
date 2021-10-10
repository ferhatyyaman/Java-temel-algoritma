package sayiterscevir;

import java.util.Scanner;

public class sayiterscevir {
    public static void main(String[] args) {

        int ters = 0, kalan;
        System.out.println("Bir sayi girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        while (veri != 0) {
            kalan = veri % 10;
            ters = ters * 10 + kalan;
            veri = veri / 10;

        }
        System.out.println("Basamak sayisi => " + ters); // deger ekrana yazdırılıyor
    }
}
