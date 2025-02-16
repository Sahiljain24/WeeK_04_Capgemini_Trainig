package problems.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexColor {
    public static boolean validHexColor(String colorCode){
        String regex = "^#([0-9a-fA-F]{6})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(colorCode);
        boolean flag=m.matches();
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.println("Enter color code");
            String color=sc.nextLine().trim();
            System.out.println(validHexColor(color));
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if(choice=='y'){
                break;
            }
            sc.nextLine();
        }
    }
}
