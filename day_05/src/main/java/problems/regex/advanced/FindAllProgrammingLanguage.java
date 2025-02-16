package problems.regex.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindAllProgrammingLanguage {
    private static List<String> programmingLanguage = Arrays.asList("Java", "JavaScript", "C#", "C", "Python", "Go");

    public static String findAllProgrammingLanguage(String text){
        StringBuilder matchedWords = new StringBuilder();
        for(String pl : programmingLanguage){
            String regex = "\\b"+ Pattern.quote(pl)+"\\b";
            if (text.matches(".*" + regex + ".*")) {
                matchedWords.append(pl).append(" ");
            }
        }
      return matchedWords.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter your text: ");
            String text=sc.nextLine();
            System.out.println(findAllProgrammingLanguage(text));
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
