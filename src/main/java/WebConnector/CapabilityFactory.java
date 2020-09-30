package WebConnector;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityFactory {
    public Capabilities capabilities;


    public Capabilities getCapabilities (String browser) {
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