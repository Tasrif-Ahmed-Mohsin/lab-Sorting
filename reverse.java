import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (canBeSorted(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canBeSorted(int[] arr) {
        int inversions = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    inversions++;
                }
            }
        }

        return inversions % 2 == 0;
    }
}
