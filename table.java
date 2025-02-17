import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for( int num = 1; num <= 10 ; num++){
            System.out.println(num + "*" + n + "=" + (num*n));
            sc.close();
        
        }
    }
}