package problems.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {
    public static boolean isValidUserName(String userName){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(userName);
        boolean flag=m.matches();
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isValidUserName("user123_"));
        System.out.println(isValidUserName("12User123"));
        System.out.println(isValidUserName("Use"));
    }
}
