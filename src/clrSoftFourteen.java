import java.util.Scanner;
public class clrSoftFourteen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütüfen bir sayı giriniz");
        int number = scan.nextInt();
        int sum = 0;
        int sum2 = number;
        while (number > 0) {
            int x = number % 10;
            sum = (sum * 10) + x;
            number /= 10;
        }

        if (sum2==sum){
            System.out.println("palindrom");

        }else {
            System.out.println("değil");
        }
        }

    }

