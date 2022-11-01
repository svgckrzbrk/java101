package Java101Dersleri;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double kg,m,bmi;
        Scanner sc= new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg=sc.nextDouble();
        System.out.print("Lütfen Boyunuzu Giriniz: ");
        m= sc.nextDouble();
        bmi=kg/(m*m);
        System.out.println("Vücut Kitle Endeksiniz: " +bmi + " m²");

        if(bmi < 18.5) {
            System.out.println("İdeal Kilonun Altında ");
        }else if (bmi < 25) {
            System.out.println("İdeal Kiloda");
        }else if (bmi < 30) {
            System.out.println("İdeal Kilonun Üstünde");
        }else {
            System.out.println("Obezite");
        }




    }
}
