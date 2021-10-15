package üsAlma;

import java.util.Scanner;

public class üsAlma {

    public static void main(String[] args) {

        int taban, us, sonuc = 1;

        System.out.println("taban ve üs sayisi girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        taban = verial.nextInt(); // girilen deger alınıyor
        us = verial.nextInt(); // girilen deger alınıyor

        while (us != 0) {
            sonuc = taban * sonuc;
            us--;
        }
        System.out.println("sonuc: " + sonuc); // kullanıcı sayı giriyor

    }
}
