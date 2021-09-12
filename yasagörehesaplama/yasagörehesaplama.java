package yasagörehesaplama;

import java.util.Scanner;

public class yasagörehesaplama { // Kullanıcıdan yaşını sorarak ay, hafta, gun,saat,dakika ve saniye olarak
                                 // hesaplayan program.

    public static void main(String[] args) {
        System.out.println("yasinizi giriniz: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu

        int yas = verial.nextInt(); // girilen deger alınıyor
        int ay = yas * 12;
        int hafta = yas * 52;
        int gun = yas * 365;
        int saat = yas * 365 * 24;
        int dakika = yas * 365 * 24 * 60;
        int saniye = yas * 365 * 24 * 60 * 60;

        System.out.println("yasiniz " + yas + "olduguna göre"); // degerler ekrana yazdırılıyor
        System.out.println("ay: " + ay);
        System.out.println("hafta: " + hafta);
        System.out.println("gun: " + gun);
        System.out.println("saat: " + saat);
        System.out.println("dakika: " + dakika);
        System.out.println("saniye: " + saniye);

    }

}