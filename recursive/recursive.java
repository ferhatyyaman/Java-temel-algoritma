package recursive;

import java.util.Scanner;

public class recursive {

    public static int sayiTopla(int n) {
        if (n != 0)
            return n + sayiTopla(n - 1);
        else
            return n;
    }

    public static void main(String[] args) {

        System.out.println("sayi girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri = verial.nextInt(); // girilen deger alınıyor
        System.out.println("toplam: " + sayiTopla(veri)); // kullanıcı sayı giriyor

    }
}
