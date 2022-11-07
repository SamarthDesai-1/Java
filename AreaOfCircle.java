import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        float area;
        try (Scanner sc = new Scanner(System.in)) {
            float r ,pie  = 3.14f;
            System.out.print("Enter Radius : ");
            r = sc.nextFloat();

            area = pie * r *r;
        }

        System.out.println("Area of circle : " + area);
    }
}
