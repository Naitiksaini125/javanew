import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("A");
        }
        else{
            if (80 <= marks || marks> 89) {
                System.out.println("B");
            }
            else{
                if (70<=marks || marks<79) {
                    System.out.println("C");
                }
                else{System.out.println("fail");} // damn below 70 fail why? ;( //
            }
            sc.close();
        }
    }
}
