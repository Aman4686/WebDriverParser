package Parsers;

import java.util.ArrayList;

public class Parser {
    public static void main(String[] args) {
        
//        long startTime = System.currentTimeMillis();

        AliParser parser = new AliParser("https://flashdeals.aliexpress.com/en.htm");
        ArrayList<AliProduct> products = parser.parseProducts(100);

        new WriteToCSV().writeFromList(products);

//        long timeSpent = System.currentTimeMillis() - startTime;
//        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");

    }
}