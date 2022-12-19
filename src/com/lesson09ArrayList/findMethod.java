package com.lesson09ArrayList;

import java.util.regex.*;
//The find() method of Matcher Class attempts to find the next subsequence
// of the input sequence that find the pattern. It returns a boolean value showing the same.
public class findMethod {
    public static void main(String[] args)
    {

        // Get the regex to be checked
        String regex = "ABC";

        // Create a pattern from regex
//        The compile(String) method of the Pattern
//        class in Java is used to create a pattern
//         from the regular expression passed
//         as parameter to method. Whenever you need to match a text against a regular expression pattern more than one time, create a Pattern instance using the Pattern.compile() method.
        Pattern pattern
                = Pattern.compile(regex);

        // Get the String to be matched
        String stringToBeMatched
                = "GFGFGFGFGFGFGFGFGFG";

        // Create a matcher for the input String
        Matcher matcher
                = pattern
                .matcher(stringToBeMatched);

        // Get the subsequence
        // using find() method
        System.out.println(matcher.find());
    }
}
