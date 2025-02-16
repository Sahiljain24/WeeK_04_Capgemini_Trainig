package problems.regex.advanced;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PrintCurrencyValue {
    public static void printCurrency(String text){
        String regex = "\\$?\\d+\\.\\d{2}";
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(m.group());
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter text");
            String text=sc.nextLine().trim();
            printCurrency(text);
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
    }
}
