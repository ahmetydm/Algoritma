import java.util.Scanner;

public class clrSoftFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı girmek istiyorsunuz? ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();
            sum += sayi;
        }

        System.out.println("Girilen sayıların toplamı: " + sum);
    }
}
