package problems.regex.advanced;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static boolean validSSN(String num){
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(num);
        boolean flag=m.matches();
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter color code");
            String num=sc.nextLine().trim();
            System.out.println(validSSN(num));
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
    }
}
