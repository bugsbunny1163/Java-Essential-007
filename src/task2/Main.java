package task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[3];
        int currentYear = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < workers.length; i++) {
                workers[i] = new Worker();
                System.out.println("введіть прізвище та ініціали");
                workers[i].name = bufferedReader.readLine();
                System.out.println("введіть посаду");
                workers[i].position = bufferedReader.readLine();
                do {
                    try {
                        System.out.println("введіть рік початку роботи");
                        workers[i].startYear = Integer.parseInt(bufferedReader.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                        System.out.println("некоректно введено рік");
                    }
                } while (workers[i].startYear == 0);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("--------------------------------");

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }

        do {
            try {
                System.out.println("введіть поточний рік");
                currentYear = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("некоректно введено рік");
            }
        } while (currentYear == 0);


        for (int i = 0; i < workers.length; i++) {
            if (workers[i].startYear < currentYear) {
                System.out.println(workers[i].name);
            }
        }
    }
}