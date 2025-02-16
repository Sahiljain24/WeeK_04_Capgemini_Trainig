package problems.regex.extracts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PrintAllEmailAddress {
    public static void possibleEmails(String text){
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter your text: ");
            String text=sc.nextLine();
            possibleEmails(text);
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
    }
}
