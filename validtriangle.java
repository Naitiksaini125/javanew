import java.util.Scanner;

public class validtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int c = 0;
        if (a+b > c || b+c > a || a+c > b) {
            System.out.println("triangle can be form");
        }
        else{
            System.out.println("trianle cannot be formed");
        }
    }
}
