import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[]arr=new long[T];
        for (int t = 0; t < T; t++) {
            arr[t] = sc.nextLong();

        }
        long sum=0;
        for(int n=0;n<T;n++){

            sum=(arr[n]*(arr[n]+1))/2;
            System.out.println(sum);
        }
    }
}
