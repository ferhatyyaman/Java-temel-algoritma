package faktoriyel;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        int fact = 1;

        System.out.println("bir sayi giriniz"); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        if (veri < 0) {
            System.out.println("negatif sayilarda faktoriyel hesaplanmaz = " + veri); // deger ekrana yazdırılıyor
        } else {
            for (int i = 1; i <= veri; i++) {
                fact = fact * i;
            }
            System.out.println("faktoriyelin sonucu = " + fact); // deger ekrana yazdırılıyor
        }

    }

}
