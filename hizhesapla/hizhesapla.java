package hizhesapla;

import java.util.Scanner;

public class hizhesapla {

    public static void main(String[] args) {

        float hiz = 0;
        Scanner veri = new Scanner(System.in); // nesne oluşturuldu

        System.out.println("gidilecek mesafeyi giriniz(m)= ");
        int mesafe = veri.nextInt();
        System.out.println("varilmak istenen zamani giriniz(sn)= "); // kullanıcı sayıları giriyor
        int zaman = veri.nextInt();

        System.out.println("hiz = " + (float) mesafe / zaman);

    }
}