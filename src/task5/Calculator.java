package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void sub(int a, int b) {
        System.out.println(a - b);
    }

    static void mul(int a, int b) {
        System.out.println(a * b);
    }

    static void div(int a, int b) {
        try {
            System.out.println((double) (a / b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("введіть змінну а");
            int var1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("введіть змінну b");
            int var2 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("введіть дію \"add\" – сложение, \"sub\" – вычитание, \"mul\" – умножение, \"div\" – деление");
            String action = bufferedReader.readLine();
            switch (action) {
                case "add" -> add(var1, var2);
                case "sub" -> sub(var1, var2);
                case "mul" -> mul(var1, var2);
                case "div" -> div(var1, var2);
                default -> System.out.println("вказана не існуюча дія");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
