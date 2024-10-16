import java.util.Scanner;

public class clrSoftFive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("fibonacci kaçıncı sırada ");
        int number = scan.nextInt();
        int x=1;
        int y=0;
        for (int i=0;i<number; i++){
            int sum = x+y;
            x=y;
            y = sum;

        }
        System.out.println(y);


    }
}
