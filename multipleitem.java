import java.util.Scanner;

public class multipleitem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("how many product u have bought ?");
        //int i = sc.nextInt();
        System.out.println("name");
        String n = sc.nextLine();
        System.out.println("price");
        int p = sc.nextInt();
        System.out.println("quantity");
        int q = sc.nextInt();
        int t = 0;
        System.out.println( "total bill = " + (t += p*q));
        
        sc.close();
    }
}
