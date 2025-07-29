import java.util.Scanner;

public class PRIMEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        for(int i = 1 ; i <= n; i++){
            if (n % 1 == 0) {
                p++;
            }
        }
        if (p == 2) {
            System.out.println( n + " is prime");
        }
        else{
            System.out.println( n + " is not prime");
        }
        sc.close();
    }
}
