package problems.regex.advanced;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCreditCardNumber {
    public static boolean validCardNumber(String text){
        String regex = "^(4\\d{15}|5\\d{15})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        boolean flag=m.matches();
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter text");
            String number=sc.nextLine().trim();
            System.out.println(validCardNumber(number));
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
    }
}
