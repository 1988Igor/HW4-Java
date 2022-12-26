package org.example;

import java.util.Stack;

//1) Вывести список на экран в перевернутом виде (без массивов)
//Пример:
//1 -> 2->3->4
//Вывод:
//4->3->2->1
public class Task1 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int s = stack.size();
        for (int j = 0; j < s; j++) {
            System.out.println(stack.pop());
        }
    }
}
