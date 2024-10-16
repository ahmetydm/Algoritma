import java.util.Arrays;

public class clrSoftThirteen {
    public static void main(String[] args) {

        int[] numbers = {9, 3, 7, 6, 2, 1 };
        int sum = 0;
        String sum2 = " ";

        Arrays.sort(numbers);
        for (int i:numbers){
            if (sum<i){
                sum=i;
                sum2+=" "+sum;
            }
        }
        System.out.println(sum2);
    }
}
