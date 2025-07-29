import java.util.Scanner;

public class sum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0 ,r =0 ;
        do{

            System.out.println("enter num");
             n = sc.nextInt();
             r += n;
        }
        while( n != 0);
        System.out.println( "total sum is "+ r);
        sc.close();
    
    }
}
