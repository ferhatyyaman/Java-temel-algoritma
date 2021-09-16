package OyKullanabilmeHesapalama;

import java.util.Scanner;

public class OyKullanabilmeHesaplama {

    public static void main(String[] args) {

        System.out.println("yasinizi giriniz"); // kullanıcı sayı giriyor

        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int yas = verial.nextInt(); // girilen deger alınıyor

        if (yas > 18) {
            System.out.println("Secimlerde oy verme yeterligine sahipsiniz  "); // deger ekrana yazdırılıyor
        } else {
            System.out.println("Secimlerde oy verme yeterligine sahip değilsiniz "); // deger ekrana yazdırılıyor
            System.out.println("secimlerde oy vermeye kalan zaman = " + (18 - yas) + " yıl"); // deger ekrana
                                                                                              // yazdırılıyor

        }

    }

}
