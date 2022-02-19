package placement;

import java.util.Scanner;

public class Placement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        thirdNumber = scanner.nextInt();
        scanner.close();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {

            if (secondNumber > thirdNumber) {
                System.out.println(firstNumber + ">" + secondNumber + ">" + thirdNumber);
            } else {
                System.out.println(firstNumber + ">" + thirdNumber + ">" + secondNumber);
            }
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            if (firstNumber > thirdNumber) {
                System.out.println(secondNumber + ">" + firstNumber + ">" + thirdNumber);
            } else {
                System.out.println(secondNumber + ">" + thirdNumber + ">" + firstNumber);
            }
        } else {
            if (secondNumber > firstNumber) {
                System.out.println(thirdNumber + ">" + secondNumber + ">" + firstNumber);
            } else {
                System.out.println(thirdNumber + ">" + firstNumber + ">" + secondNumber);
            }
        }
    }
}
