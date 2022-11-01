package Java101Dersleri;

public class ifandelse {
    public static void main(String[] args) {
        int a=20,b=20;
        boolean compare=a==b;
        //String str= compare?"eşit":"eşit değil";
        //System.out.println(str);
        a=50;

        if(a==b){

            System.out.println("A sayısı: "+a);
            System.out.println("B sayısı: "+b);
            System.out.println("eşittir");
        }else{
            System.out.println("A sayısı: "+a);
            System.out.println("B sayısı: "+b);
            System.out.println("eşit değildir");
        }
        System.out.println("program bitti");

        //soru:neden a değeri değiştiği halde eşitlik üstteki değişkene göre
        // sonuçlanıyor?


    }
}
