package Java101Dersleri;
import java.util.Scanner;
public class importing {
    public static void main(String[] args) {
        String a;
        Scanner input =new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        a = input.nextLine();
        System.out.println(a);
        double b;

        System.out.print("ondalıklı sayıs giriniz: ");
        b = input.nextDouble();
        System.out.print(b);

    }
}
