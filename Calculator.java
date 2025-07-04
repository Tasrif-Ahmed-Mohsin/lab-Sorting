import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < T; i++) {
            String line = scan.nextLine(); // e.g., "calculate 67 + 41"
            String[] parts = line.split(" ");

            double a = Double.parseDouble(parts[1]);
            String op = parts[2];
            double b = Double.parseDouble(parts[3]);

            double result = 0;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            // Print with 6 digits after decimal
            System.out.printf("%.6f\n", result);
        }

        scan.close();
    }
}

