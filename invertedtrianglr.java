import java.util.Scanner;

public class invertedtrianglr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        for(int i = 1; i <= r; i++){
            for( int j = i; j <= r; j++){
                System.out.print("*");
            }
            
            System.out.println();
            sc.close();
        }
        
    }
}
