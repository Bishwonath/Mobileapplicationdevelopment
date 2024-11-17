import java.util.Scanner;

public class FourRomanToInteger {

    public static int romanToInt(String s) {
        // Map for Roman numeral symbols and their corresponding values
        int[] romanValues = new int[256]; // Use a larger array to handle ASCII values
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;
        
        int result = 0;
        
        // Iterate through the Roman numeral string from left to right
        for (int i = 0; i < s.length(); i++) {
            // If the current numeral is smaller than the next one, subtract its value
            if (i + 1 < s.length() && romanValues[s.charAt(i)] < romanValues[s.charAt(i + 1)]) {
                result -= romanValues[s.charAt(i)];
            } else {
                result += romanValues[s.charAt(i)];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a Roman numeral
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();  // Convert input to uppercase

        // Call romanToInt method and display the result
        System.out.println("The integer value of " + roman + " is " + romanToInt(roman));
        
        // Close the scanner
        scanner.close();
    }
}
