package hello.hellospring.jsoup.Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {

    @Test
    void Test01() throws InterruptedException {
        //WebDriver 설정
        WebDriver driver;
        WebElement element;
         String url;

        //Properties 설정
         String WEB_DRIVER_ID = "webdriver.chrome.driver";
        String WEB_DRIVER_PATH = "C:/Users/dksdu/IdeaProjects/hello-spring/chromedriver.exe";
        String TEST_URL = "https://velog.io/@jkzombie/%EC%9B%B9%ED%81%AC%EB%A1%A4%EB%A7%81-JAVA-Selenium";
        // (여기선 naver 를 사용해봤습니다.)
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

        ChromeOptions chromeOptions = new ChromeOptions();
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get(TEST_URL);
        chromeDriver.wait(2000);
        chromeDriver.close();
    }
}
