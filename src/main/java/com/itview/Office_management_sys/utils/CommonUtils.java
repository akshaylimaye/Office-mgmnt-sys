package com.itview.Office_management_sys.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {


    public static Boolean isValidNumber(String phoneNumber) {

        Pattern p = Pattern.compile("^[0-9]{10}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }
}
