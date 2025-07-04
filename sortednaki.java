import java.util.Scanner;

public class sortednaki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String numbs;
scan.nextLine();
        for (int i = 0; i < n; i++) {

         int slot = scan.nextInt();
         scan.nextLine();
            String[] digit;
            numbs = scan.nextLine();
            digit=numbs.split(" ");
            boolean flag = true;
            for(int j=0;j<slot-1;j++){
               int a= Integer.parseInt(digit[j]);
                int b= Integer.parseInt(digit[j+1]);
                if(a<=b){
                    flag=true;
                }
                if(b<a){
                    flag=false;
                    break;
                }
           }
if(flag==true){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
        }



scan.close();


    }

}
