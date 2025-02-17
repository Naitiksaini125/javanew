import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit consume");
        int u = sc.nextInt();
        int b = 0;
        if (u <= 100) {
            b = u*5;
        }
        else{
            if (u >= 101 && u <= 300) {
                b = 100*5 + (u-200)*7;
            }
            if (u > 300) {
                b = 100*5 + 200*7 + (u-300)*10;
            }
        }
        System.out.println("total bill = " + b);
        sc.close();
    }
}
