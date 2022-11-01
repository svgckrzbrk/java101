package Java101Dersleri;
import java.util.Scanner;
public class taximeters {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,startPrice=10, minimumPrice=20,totalPrice;

        Scanner input= new Scanner(System.in);
        System.out.print ("Mesafeyi km Cinsinden Giriniz: " );
        km=input.nextInt();
        totalPrice=(km* perKm);
        totalPrice+=startPrice;
        totalPrice= (totalPrice< minimumPrice)?minimumPrice :totalPrice;
        System.out.println("Toplam tutar"+totalPrice);


    }
}
