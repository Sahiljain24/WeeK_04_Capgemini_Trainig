package problems.regex.extracts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintAllCapitalizeWords {
    public static void possibleCapitalLetterWords(String text){
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.print(m.group()+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter your text: ");
            String text=sc.nextLine();
            possibleCapitalLetterWords(text);
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
    }
}
