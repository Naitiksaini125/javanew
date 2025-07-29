import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String reverse = " ";
        char ch;
        for(int i=0;i<st.length();i++){
            ch = st.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("reverse string = " + reverse);
        sc.close();
    }
}
