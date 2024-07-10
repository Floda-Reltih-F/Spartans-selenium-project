package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class acctivity2 {
    public static void main(String[] args) {
        ChromeDriver browseing = new ChromeDriver();

        browseing.manage().window().maximize();
        browseing.get("https://dev.insurance.tekschool-students.com/");
        String title =  browseing.getTitle();
        System.out.println(title);
        browseing.quit();
    }
}
