import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int flag = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + "is not prime number");
        }
        else{
            int middlenumber = number / 2;
            for(int i=2;i<=middlenumber;i++){
                if (number % 1 == 0) {
                    System.out.println(number + "is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + "is prime number");
            }
            sc.close();
        }
       }
    }

