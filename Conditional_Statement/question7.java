import java.util.Scanner;

public class question7 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int unit = sc.nextInt();
        int bill;
        int extraunit;
        if (unit <= 100) {
            bill = 5 * unit;

            System.out.println("Bill:" + bill);
        } else if (unit <= 200) {
            extraunit = unit - 100;
            bill = 5 * 100;
            bill += (7 * extraunit);
            System.out.println("Bill:" + bill);
        } else {
            extraunit = unit - 200;
            bill = 5 * 100;

            bill += (7 * 100);
            bill += (extraunit * 10);
            System.out.println("Bill:" + bill);

        }
    }

}
