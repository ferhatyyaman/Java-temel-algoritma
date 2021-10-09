package Carpımtablosu;

import java.util.Scanner;

public class Carpımtablosu {
    public static void main(String[] args) {
        int carpim = 0;
        int i = 0;
        System.out.println("bir sayi giriniz"); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        if (veri < 0) {
            System.out.println("negatif sayi girdiniz = " + veri); // deger ekrana yazdırılıyor
        } else {
            System.out.println("carpim tablosu");
            for (i = 1; i < 10; i++) {
                carpim = veri * i;

                System.out.println(veri + " * " + i + " = " + carpim); // deger ekrana yazdırılıyor
            }

        }
    }
}
