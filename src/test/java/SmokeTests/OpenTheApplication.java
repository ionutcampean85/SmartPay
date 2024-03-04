//open the aplication in Google Chrome and maximize the window


package SmokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTheApplication {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ionut/IdeaProjects/chromedriver/chromedriver-linux64 (1)/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.skywardsmilesmall.com/spend");
        //maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://www.skywardsmilesmall.com/spend");

    }
}
