import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        try (Scanner javain = new Scanner(System.in)) {
            float a ,b ,c;
            float avg;
            System.out.print("Enter A : ");
            a = javain.nextFloat();

            System.out.print("Enter B : ");
            b =javain.nextFloat();

            System.out.print("Enter C : ");
            c =javain.nextFloat();
            
            avg = (a + b + c) / 3;

            System.out.println("The average of three numbers is : " + avg);
        }
    }
}


