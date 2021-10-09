package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int s1 = 0, s2 = 1, nextTerim;
        System.out.println("Terim sayisini girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor

        System.out.println("Fibonnaci serisi= "); // deger ekrana yazdırılıyor
        for (int i = 1; i <= veri; i++) {
            System.out.print("  " + s1); // deger ekrana yazdırılıyor
            nextTerim = s1 + s2;
            s1 = s2;
            s2 = nextTerim;
        }

    }
}
