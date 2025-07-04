
import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int[] arr=new int[t];

        for(int i=0;i<t;i++){

            arr[i]=scan.nextInt();;

        }
        for(int j=0;j<t;j++){
            if(arr[j]%2==0){
                System.out.println(arr[j]+" is an Even number.");
            }
            else{
                System.out.println(arr[j]+ " is an Odd number.");
            }
        }

        scan.close();

    }
}
