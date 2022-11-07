import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        float bill;
        try (Scanner javain = new Scanner (System.in)) {
            float pen ,pencil ,era ,gst;

            System.out.print("Enter cost of pen : ");
            pen = javain.nextFloat();

            System.out.print("Enter cost of pencil : ");
            pencil = javain.nextFloat();

            System.out.print("Enter cost of eraser : ");
            era = javain.nextFloat();

            gst = pen + pencil + era * 18 / 100;
            bill = pen + pencil + era + gst;
        }

        System.out.println("Total bill including 18% GST is : " + bill);
    }
}
