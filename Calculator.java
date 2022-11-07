import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        float a ,b;
        String operator;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            a = sc.nextFloat();
            System.out.print("Enter perform operator : ");
            operator = sc.next();
            System.out.print("Enter B : ");
            b = sc.nextFloat();
            switch (operator) {
                case "+":
                    System.out.println("Sum -> " + (a + b));
                    break;
                case "-":
                    System.out.println("Difference -> " + (a - b));
                    break;
                case "*":
                    System.out.println("Product -> " + (a * b));
                    break;
                case "/":
                    System.out.println("Division -> " + (a / b));
                    break;
            
                default: System.out.println("Error");
                    break;
            }
        }
    }
}

