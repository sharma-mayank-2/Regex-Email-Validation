package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class to show a working example of a Regex and validate the email-Address.
 */
public class RegexValidation {
    public static void main(String[] args) {
        String s = "mayank sharma email id is sharma.mayank.iitm@gmail.com and also mayank.sharma.57@gmail.com ";
        patterMatch("[a-zA-Z0-9.-_]{1,}\\@[a-zA-Z0-9._-]{1,}\\.[a-zA-Z]{2,4}", s);
    }

    public static void patterMatch(String s1, String s2){
        Pattern compile = Pattern.compile(s1);
        Matcher matcher = compile.matcher(s2);
        while(matcher.find()){
            if(matcher.group().length() != 0){
                System.out.println(matcher.group().trim());
            }
            System.out.println("starting..."+matcher.start());
            System.out.println("ending..."+matcher.end());
        }
    }
}


