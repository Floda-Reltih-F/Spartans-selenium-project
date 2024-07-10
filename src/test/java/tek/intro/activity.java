package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class activity {
    public static void main(String[] args) {
        // open browser
        ChromeDriver browesing = new ChromeDriver();
        // maximise window
        browesing.manage().window().maximize();
        // naviate to FB
        browesing.get("https://facebook.com");
        // cach title
        String itle = browesing.getTitle();
        System.out.println(itle);

        // chrom.quit
        browesing.quit();





    }
}
