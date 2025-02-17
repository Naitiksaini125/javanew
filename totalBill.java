import java.util.Scanner;

public class totalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price and quantity");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("total bill "+ p*q);
        sc.close();
    }
}
