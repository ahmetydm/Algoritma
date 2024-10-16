import java.util.Scanner;

public class clrSoftNine {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,7,11,13 };
        Scanner scan = new Scanner(System.in);
        System.out.println("hangi elemanı arıyorsunuz");
        int number = scan.nextInt();
        int sum = 0;
        for (int i:numbers){
            if (i==number){
                sum=+2;
            }
        }
        if (sum>0) {
            System.out.println("bulundu");
        }else{
            System.out.println("bulunamadı");

        }
    }
}
