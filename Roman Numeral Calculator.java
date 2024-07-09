import java.util.Scanner;

public class RomanNumeralCalculator {
    
    private static final int[] VALUES = {1000, 500, 100, 50, 10, 5, 1};
    private static final String[] SYMBOLS = {"M", "D", "C", "L", "X", "V", "I"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
        while (running) {
            System.out.println("Roman Numeral Calculator and Converter");
            System.out.println("--------------------------------------");
            System.out.println("1. Calculator");
            System.out.println("2. Conversions");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    calculator(scanner);
                    break;
                case 2:
                    conversions(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void calculator(Scanner scanner) {
        System.out.println("Roman Numeral Calculator");
        System.out.println("------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter the first Roman Numeral: ");
        String roman1 = scanner.next().toUpperCase();
        int decimal1 = convertToDecimal(roman1);
        
        System.out.print("Enter the second Roman Numeral: ");
        String roman2 = scanner.next().toUpperCase();
        int decimal2 = convertToDecimal(roman2);
        
        int result = 0;
        String resultRoman = "";
        
        switch (choice) {
            case 1:
                result = decimal1 + decimal2;
                resultRoman = convertToRoman(result);
                System.out.println(decimal1 + " + " + decimal2 + " = " + result + " (" + resultRoman + ")");
                break;
            case 2:
                result = decimal1 - decimal2;
                if (result <= 0) {
                    System.out.println("Result cannot be negative or zero in Roman Numerals.");
                    break;
                }
                resultRoman = convertToRoman(result);
                System.out.println(decimal1 + " - " + decimal2 + " = " + result + " (" + resultRoman + ")");
                break;
            case 3:
                result = decimal1 * decimal2;
                resultRoman = convertToRoman(result);
                System.out.println(decimal1 + " * " + decimal2 + " = " + result + " (" + resultRoman + ")");
                break;
            case 4:
                if (decimal2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = decimal1 / decimal2;
                resultRoman = convertToRoman(result);
                System.out.println(decimal1 + " / " + decimal2 + " = " + result + " (" + resultRoman + ")");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    private static void conversions(Scanner scanner) {
        System.out.println("Roman Numeral Conversions");
        System.out.println("-------------------------");
        System.out