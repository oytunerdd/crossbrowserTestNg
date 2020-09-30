package WebConnector;
import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    public static Capabilities capabilities;

//Bring options for testNG browser values
    public static Capabilities getCapabilities(String browser) {
        if (browser.equals("firefox")) {
            capabilities = WebConnector.OptionsManager.getFirefoxOptions();
        }
        else if (browser.equals("chrome")){
            capabilities = WebConnector.OptionsManager.getChromeOptions();
        }
        else if(browser.equals("headless"))
            capabilities = WebConnector.OptionsManager.headlessChromeOptions();
        return capabilities;
    }
}