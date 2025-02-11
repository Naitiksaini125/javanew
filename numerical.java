import java.util.Scanner;

public class numerical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int i = 0;
        int j = 0;
        int k = 0;
        for( i = 1; i <= r; i++){
            for( j = i; j <= r; j++){
            System.out.print(j);}
        
        
        for( k = 1; k <= i-1; k++){
        System.out.print(k);}
        System.out.println();}
    }
    
    
}
