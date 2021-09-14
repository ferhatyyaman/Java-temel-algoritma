package kucukbuyuksayibulma;

import java.util.Scanner;

public class kucukbuyuksayibulma {

    public static void main(String[] args) {
        System.out.println("iki sayi giriniz"); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int sayi1 = verial.nextInt(); // girilen deger alınıyor
        int sayi2 = verial.nextInt(); // girilen deger alınıyor

        if (sayi1 > sayi2)
            System.out.println("büyük olsan sayi = " + sayi1); // deger ekrana yazdırılıyor
        else if (sayi1 == sayi2)
            System.out.println("sayilar birbirine esittir "); // deger ekrana yazdırılıyor
        else
            System.out.println("büyük olsan sayi = " + sayi2); // deger ekrana yazdırılıyor
    }

}