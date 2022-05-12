package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Price[] prices = new Price[2];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < prices.length; i++) {
            prices[i] = new Price();
            System.out.println("введіть назву товару");
            prices[i].name = bufferedReader.readLine();
            System.out.println("введіть назву магазину");
            prices[i].shop = bufferedReader.readLine();
            System.out.println("введіть ціну товару");
            prices[i].price = Double.parseDouble(bufferedReader.readLine());
        }
        for (Price price : prices) {
            System.out.println(price);
        }

        System.out.println("введіть назву магазину");
        String current_shop = bufferedReader.readLine();

        for (int i = 0; i < prices.length; i++) {
            try {
                if (prices[i].shop.equals(current_shop)) {
                    System.out.println(prices[i]);
                } else {
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

