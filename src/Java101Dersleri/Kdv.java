package Java101Dersleri;
import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18,kdvTutar, kdvliTutar;
        Scanner input= new Scanner(System.in);
        System.out.print("Ürün Tutarı Giriniz: ");
        tutar= input.nextDouble();

        kdvTutar= tutar*kdvOran;
        kdvliTutar= tutar+kdvTutar;


        System.out.println("Kdvsiz Tutar: " +tutar);
        System.out.println("Kdv Oranı: " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Kdvli Tutar: " + kdvliTutar);

    }
}
