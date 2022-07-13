package com.CWH;

import java.util.Locale;

public class CWH_14_String_Methods {
    public static void main(String[] args) {
        String name = "Aman";
        System.out.println("The string is printed "+ name);
//
//        int value = name.length();
//        System.out.println("\nThe string length is printed "+ value);
//
//        String lstr = name.toLowerCase();
//        System.out.println("\nThe string in lowercase is printed "+ lstr);
//
//        String ustr = name.toUpperCase();
//        System.out.println("\nThe string in uppercase is printed " + ustr);
//
//        String nonTrimmedString = "          Harry           ";
//        System.out.println("\nThe NonTrimmedString is printed "+nonTrimmedString);
//        String tstr = nonTrimmedString.trim();
//        System.out.println("The trim is printed " + tstr);
//
//        //Another way to print the trimmed string
//        System.out.println("The 2nd way trim the string " + nonTrimmedString.trim());
//
//        //Printing the substring of the string
//        System.out.println("The substring of the main String " + name + " is " + name.substring(2));

        //Using the method of name.indexOf("",int)
//        System.out.println(name.indexOf("n",3));

        //Using the method name.lastIndexOf("");
        String modifiedName = "Amanananananan";
        System.out.println(modifiedName.lastIndexOf("a"));
    }

}
