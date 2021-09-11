import java.util.Scanner;
public class scanner {
   

    public static void main (String[] args) {
		System.out.println("bir sayi giriniz");         //kullanıcı sayı giriyor
		Scanner verial=new Scanner(System.in);          //nesne oluşturuldu
		int veri=verial.nextInt();                      //girilen deger alınıyor      
		System.out.println("girilen deger = "+veri);    //deger ekrana yazdırılıyor
}
	

	}
    
}
