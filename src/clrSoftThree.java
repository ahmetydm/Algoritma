import java.util.Scanner;

public class clrSoftThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tek mi çift mi");
        int number = scanner.nextInt();
        if (number %2 ==0){
            System.out.println("çift");
        }else {
            System.out.println("tek");
        }
    }
}
