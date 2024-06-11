package day09;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

public class SetChromeZoom {
    public static void main(String[] args) {
        // If ChromeDriver is in your system's PATH, you can comment out the following line
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        
        // Start ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);
        
        try {
            // Use CDP (Chrome DevTools Protocol) to set the zoom level to 80%
            Map<String, Object> params = new HashMap<>();
            params.put("width", 1920);
            params.put("height", 1080);
            params.put("deviceScaleFactor", 1.0); // Keep the device scale factor
            params.put("mobile", false);
            params.put("scale", 0.8); // 0.8 represents 80% zoom level
            ((ChromiumDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", params);

            // Navigate to a website to verify the zoom level
            driver.get("https://www.google.com");
            
            // Perform your automation tasks here
            
        } finally {
            // Close the browser
           // driver.quit();
        }
    }
}
