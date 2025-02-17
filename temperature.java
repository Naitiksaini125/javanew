import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp. in degree C");
        int t = sc.nextInt();  
        System.out.println( t*9/5 + 32 + "F");
        if (t <= 20) {
            System.out.println("cold weather");
        }
        else{
            if (t >= 21 && t <= 30  ) {
                System.out.println("warm weather");
            }
            if (t >= 31) {
                System.out.println("hot weather");
            }
           
            sc.close();

        }

    }
}