public class clrSoftSeven {
    public static void main(String[] args) {
        int [] numbers = {5,3,9,1,6};
        int x = Integer.MIN_VALUE;
        for (int number:numbers){
            if (x<number)
                x=number;
        }
        System.out.println(x);
    }
}
