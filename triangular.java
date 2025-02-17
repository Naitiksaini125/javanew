import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int i = 0;
        for(i = 1; i <= r; i++){
           for( int j = 1; j <= r-i; j++){
            System.out.print(" ");}
        }
        for( int k = 1; k <= i; k++){
            System.out.print(k);
        }
        for( int l = 1; l >= i; l--){
            System.out.print(" ");
            
        }
        System.out.println();
        sc.close();
    }
    
}
