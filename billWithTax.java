import java.util.Scanner;

public class billWithTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bill");
        int b = sc.nextInt();
        //int p = sc.nextInt();
        System.out.println( "total bill including tax and tip = " + (b + b*(0.10) + b*(0.05)));
        sc.close();
    }
}
