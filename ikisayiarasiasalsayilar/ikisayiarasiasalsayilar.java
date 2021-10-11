package ikisayiarasiasalsayilar;

import java.util.Scanner;

public class ikisayiarasiasalsayilar {
    public static void main(String[] args) {

        System.out.println("iki sayi girin: "); // kullanıcı sayı giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri1 = verial.nextInt(); // girilen deger alınıyor
        int veri2 = verial.nextInt(); // girilen deger alınıyor

        System.out.print("iki sayi arasindaki asal sayilar => ");
        while (veri1 < veri2) {

            Boolean sayac = false;

            for (int i = 2; i <= veri1 / 2; ++i) {
                if (veri1 % i == 0) {
                    sayac = true;
                    break;
                }
            }

            if (sayac == false) {

                System.out.print("  " + veri1); // deger ekrana yazdırılıyor

            }
            ++veri1;
        }

    }
}
