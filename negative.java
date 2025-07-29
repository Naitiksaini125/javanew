import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do{
            System.out.println("enter number ");
            n = sc.nextInt();
            
        }
        while( n >= 0);
        System.out.println("you entered negative number");
        sc.close();
    }
    
}
