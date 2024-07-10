package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class fuckGoogle {
    public static <chromeDriver> void main(String[] args) {
        // opoen browser
        ChromeDriver chromeDriver = new ChromeDriver();
        // navigate to google
        chromeDriver.get("https://google.com");


    }
}
