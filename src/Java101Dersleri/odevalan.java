package Java101Dersleri;

import java.util.Scanner;

public class odevalan {
    public static void main(String[] args) {
        double 𝜋=3.14,a,dalan;
        int r;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen YarıÇapı Giriniz: ");
        r= input.nextInt();
        System.out.print("Lütfen Daire Diliminin Merkez Açısını Giriniz: " );
        a=input.nextDouble();
        dalan= (𝜋 * (r*r) *a) / 360;
        System.out.println("Daire Diliminin Alanı :"+dalan);







    }

}

