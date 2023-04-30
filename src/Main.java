import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fi



        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        System.out.print("Interest: ");
        float interest = scanner.nextFloat()/100/12;

        double result = (principal*interest*Math.pow((1+interest),months)/(Math.pow((1+interest),months)-1));

        System.out.println("Yr monthly payeoumount is "+result);









    }

}