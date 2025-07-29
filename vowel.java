import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        char check;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet");
        check = sc.next().charAt(0);
        //String check = sc.nextLine();
        switch (check) {
            case 'a','e','i','o','u','A','E','I','O','U':System.out.println("vowel");
                
                break;
        
            default:System.out.println("consonant");
                break;
        }
        sc.close();

    }
}
