import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        int week ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number between 1 to 7");
        week = sc.nextInt();
        switch (week) {
            case 1:System.out.println("sunday"); 
                break;
                case 2:System.out.println("monday"); 
                break;
                case 3:System.out.println("tuesday"); 
                break;
                case 4:System.out.println("wednesday"); 
                break;
                case 5:System.out.println("thrusday"); 
                break;
                case 6:System.out.println("friday"); 
                break;
                case 7:System.out.println("saturday"); 
                break;
        
            default:System.out.println("number enter is not valid"); 
                break;
        }
        sc.close();
    }
}
