package Java101Dersleri;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        boolean kosul1=(sonuc>60);
        boolean kosul2=(sonuc<=60);
        String str= (kosul1)? "Sınıfı Geçtiniz": "Sınıfta Kaldınız ";
        System.out.print(str+ " Ortalamanız: " +sonuc);



    }




}
