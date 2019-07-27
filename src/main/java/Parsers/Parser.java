package Parsers;


import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class Parser {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        AliParser parser = new AliParser("https://flashdeals.aliexpress.com/ru.htm");

        ArrayList<AliProduct> products = parser.parseProducts(100);

        // TODO: Serialize it
        for (AliProduct el: products) {
            System.out.println(el.toString());
        }
        System.out.println("elements parsed count: "+products.size());
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent/1000 + " секунд");
//        parser.parseProducts(100).forEach(System.out::println);
    }
}