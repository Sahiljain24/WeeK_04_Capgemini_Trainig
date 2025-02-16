package problems.regex.replaceandmodify;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpace {
    public static String removeMultipleSpaces(String text){
        String regex = "\\s+",ans="";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        return text.replaceAll(regex," ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter your text: ");
            String text=sc.nextLine();
            System.out.println(removeMultipleSpaces(text));
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
