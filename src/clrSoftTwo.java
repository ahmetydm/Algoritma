import java.util.Scanner;

public class clrSoftTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("faktöriyal hesapla");
        int number = scan.nextInt();
        int sum = 1;
        for (int i=1; i<=number;i++){
            sum=sum*i;
        }

        System.out.println(sum);

    }
}

