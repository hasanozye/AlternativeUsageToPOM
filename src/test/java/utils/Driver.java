package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    protected static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (drivers.get() == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--start-maximized");
            drivers.set(new ChromeDriver(options));
        }
        return drivers.get();
    }


    public static void quitDriver(){
        if (drivers.get() != null) {
            drivers.get().quit();
            drivers.set(null);
        }
    }
}
