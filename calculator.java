import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int operator ;
        System.out.println(" 1 - add \n 2 - subtract \n 3 - multipy \n 4 - divide");
        System.out.println("choose operatpr");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case 1:System.out.println("sum = " + (a+b));
                break;
                case 2: System.out.println("sub = " + (a-b));
                break;
                case 3: System.out.println("multiply = " + (a*b));
                break;
                case 4: System.out.println("divide = " + (a/b));
                break;
            default:System.out.println("operator is invalid");
                break;
                
        }
        sc.close();
    }
}
