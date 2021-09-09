import java.util.Scanner;

public class ikisayitopla {

    public static void main(String[] args) {
        System.out.println("iki sayi giriniz"); // kullanıcı sayıları giriyor
        Scanner verial = new Scanner(System.in); // nesne oluşturuldu
        int veri1 = verial.nextInt();
        int veri2 = verial.nextInt(); // girilen deger alınıyor
        System.out.println("girilen degerler toplamı = " + (veri1 + veri2)); // deger ekrana yazdırılıyor
    }

}
