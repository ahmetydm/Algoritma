import java.util.Scanner;

public class clrSoftEight {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String normal = scan.next();
    String reverse = "";
    for (int i=normal.length()-1;i>=0;i--){
        reverse+=normal.charAt(i);
    }
    System.out.println(reverse);
}
}
