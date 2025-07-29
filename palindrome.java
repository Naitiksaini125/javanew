import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r , o = 0 , c = 0;
        n = c;
        do{
            r = n%10;
            o = o*10+r;
            n = n/10;
        }
        while( n > 0);
        if(c == o){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
        sc.close();
    }
}
