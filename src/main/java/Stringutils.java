import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {
    //3. Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
    //
    //Tells whether or not what the user entered is a number
    //Flips the case of the string
    //Reverses the string
    public static void main(String[] args){
        //tests for c
        String testString = "This is a test string.";
        System.out.println(reverseString(testString));

        //tests for b
        String testString2 = "This Is Another Test String With Capitalized First Letters.";
        System.out.println(flipCase(testString2));

        //test for output
        System.out.println(inputManipulation());

    }

    //c
    public static String reverseString(String testString){
        return StringUtils.reverse(testString);
    }
    //b
    public static String flipCase(String testString){
        return StringUtils.swapCase(testString);
    }
    //a
    public static String numericTest(String testString){
        if(StringUtils.isNumeric(testString)){
            return "\"" + testString + "\"" + " is a number";
        } else {
            return "\"" + testString + "\"" + " is not a number";
        }
    }

    public static String inputManipulation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();

        return "You Entered: " + userInput + "\n" +
                numericTest(userInput) + "\n" +
                "Flipped Case: " + flipCase(userInput) + "\n" +
                "Reversed: " + reverseString(userInput);
    }
}
