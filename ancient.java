import java.util.Scanner;

public class ancient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean flag= true;


        while (flag) {
            flag = false;
            for (int i=0;i<x-1; i++) {
                if (arr[i]%2==arr[i+1]%2&&arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
