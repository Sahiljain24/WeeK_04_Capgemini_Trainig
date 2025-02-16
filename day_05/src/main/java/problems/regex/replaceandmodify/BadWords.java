package problems.regex.replaceandmodify;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BadWords {
    private static List<String> badWords = Arrays.asList("dumb","stupid");

    public static String removeBadWords(String text){
        for(String bw : badWords){
            String regex = "\\b"+Pattern.quote(bw)+"\\b";
            text=text.replaceAll(regex,"****");
        }
        return text;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter your text: ");
            String text=sc.nextLine();
            System.out.println(removeBadWords(text));
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
