package problems.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static boolean validLicenceNumberPlate(String numberPlate){
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(numberPlate);
        boolean flag=m.matches();
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(validLicenceNumberPlate("AB1245"));
        System.out.println(validLicenceNumberPlate("A12332"));
        System.out.println(validLicenceNumberPlate("AB12383"));
    }
}
