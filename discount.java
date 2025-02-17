import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price");
        int p = sc.nextInt();
        
        if (p >= 500 && p <= 1000) {
            System.out.println( "new price with discount = " + (p-p*5/100) );
        }
        else{ if (p > 1000) {
            System.out.println("new price with discount = " + (p-p*10/100) );
        }   
        }
        sc.close();
    }
}
