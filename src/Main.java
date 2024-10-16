import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayı");
        int number1 = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("ikinci sayı");
        int number2 = scan2.nextInt();
        System.out.println(number1+number2);
    }
}