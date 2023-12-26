package project10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexVerification {

    public static void main(String[] args) {
    	
        String testString = "Mounika2690";

        verifyPatternMatch(testString, "[a-zA-Z]+\\d+"); // Alphabets followed by digits

       
        verifyPatternMatch("mouni123@.com", "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+"); // Email address pattern
    }

    private static void verifyPatternMatch(String input, String patternString) {
        
        Pattern pattern = Pattern.compile(patternString);

       
        Matcher matcher = pattern.matcher(input);

      
        if (matcher.matches()) {
            System.out.println("String \"" + input + "\" matches the pattern: " + patternString);
        } else {
            System.out.println("String \"" + input + "\" does not match the pattern: " + patternString);
        }
    }
}

