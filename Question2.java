import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        try (Scanner javain = new Scanner(System.in)) {
            float a ,b;
            float area;
            System.out.print("Enter A : ");
            a = javain.nextFloat();

            System.out.print("Enter B : ");
            b = javain.nextFloat();

            area = a * b;

            System.out.println("Area of square : " + area);
        }
    }
}
