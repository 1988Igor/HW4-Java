package org.example;
//2) Определить является ли список знакочередующимся? (без массивов)
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int firstNumber, secondNumber,sequenceLength;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности:");
        sequenceLength = scanner.nextInt();
        System.out.println("Введите " + sequenceLength + " чисел в том числе отрицательные");
        firstNumber = scanner.nextInt();
        for (int i = 1; i < sequenceLength; i++) {
            secondNumber = scanner.nextInt();
            if ((firstNumber > 0) && ((secondNumber*(-1)) < 0)||(firstNumber<0) && ((secondNumber*(-1)) >0)) {
                flag = false;
            }
            firstNumber = secondNumber;
        }
        System.out.println("является ли список знакочередующимся = " + flag);
        scanner.close();
    }
}
