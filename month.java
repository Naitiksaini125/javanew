import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter month number");
        int month = sc.nextInt();
        switch (month) {
            case 1 , 3 , 5 , 7 , 9 , 11:System.out.println("31");
                break;
                case 2 : System.out.println("28/29");
                break;
                case 4 , 6 , 8 , 10 : System.out.println("30");
                break;
        
            default:System.out.println("invalid number");
                break;
        }
        sc.close();

    }
}
