import java.util.Scanner;

public class alancevrehesapla {

    public static void main(String[] args) {

        System.out.println("karenin bir kenarını giriniz"); // kullanıcı sayıları giriyor
        Scanner veri = new Scanner(System.in); // nesne oluşturuldu
        int kenar = veri.nextInt();

        System.out.println("karenin alani = " + (kenar * kenar));
        System.out.println("karenin cevresi = " + (4 * kenar));

    }
}
