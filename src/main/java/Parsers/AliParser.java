package Parsers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;


class AliParser
{
    private WebDriver driver;
    private String url;

    AliParser(String url) {
        this.url = url;
        System.setProperty("webdriver.chrome.driver", "chrome_driver\\chromedriver.exe");


        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    ArrayList<AliProduct> parseProducts(int count) {
        driver.get(this.url);


        ArrayList<AliProduct> products = new ArrayList<>();

        List<WebElement> images = new ArrayList<>();
        while (images.size() < count) {
            images = driver.findElements(By.cssSelector(".item-image > img"));
            scrollDown();
        }

        List<WebElement> titles = driver.findElements(By.cssSelector(".item-details-title"));
        List<WebElement> prices = driver.findElements(By.cssSelector(".current-price"));
        List<WebElement> link = driver.findElements(By.cssSelector(".deals-item-inner > a"));

        for (int i = 0; i < count; i++) {

            AliProduct product = new AliProduct();
            product.setProductUrl(link.get(i).getAttribute("href"));
            product.setImageUrl(images.get(i).getAttribute("src"));
            product.setPrice(prices.get(i).getText());
            product.setTitle(titles.get(i).getText());

            products.add(product);
        }
        driver.quit();
        return products;
    }

    /**
     * Скролит в низ страницы для того чтобы прогрузились новые товары.
     */
    private void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
