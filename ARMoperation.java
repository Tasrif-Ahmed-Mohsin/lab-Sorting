import java.util.*;

public class ARMoperation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){

          arr[i]=scan.nextLine();


        }
String[] parts=new String[3];
        double a;
        double b;
        String op;
      double answer = 0;
        for(int j=0;j<n;j++){

            parts =arr[j].split(" ");
            a= Double.parseDouble(parts[1]);
            b=Double.parseDouble(parts[3]);
            op=parts[2];
            switch (op) {
                case   "+":
                    answer = a + b;
                      break;
                case "-":
                    answer = a - b;
                      break;
                case "*":
                     answer = a * b;
                    break;
                case "/":
                     answer = a / b;
                       break;
              }
            System.out.println(answer);

        }
scan.close();

    }
}
