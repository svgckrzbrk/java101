package Java101Dersleri;

public class switched {

        public static void main(String[] args) {
            char grade = 'B';

            switch (grade) {
                case 'A':
                    System.out.println("Mükemmel: Geçtiniz");
                    break;
                case 'B':
                case 'C':
                    System.out.println("iyi: Geçtiniz");
                    break;
                case 'D':
                    System.out.println("Fena Değil: Geçtiniz");
                    break;
                case 'F':
                    System.out.println("Kaldınız");
                    break;
                default:
                    System.out.println("Geçersiz not girdiniz");


            }
        }
    }

