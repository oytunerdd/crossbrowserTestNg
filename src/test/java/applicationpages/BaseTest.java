package applicationpages;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import ConstantVariables.Constant;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver=null;
    //public  SessionId session=null;
    public static Properties prop = new Properties();
    public Actions actions;
    WebDriverWait wait ;
    public int splitPrice(String price){
        return Integer.parseInt(price.split("€ ")[1].split(",")[0]);
    }
    public Capabilities capabilities;

    public Capabilities getCapabilities (String browser) {
        if (browser.equals("firefox")) {
            capabilities = WebConnector.OptionsManager.getFirefoxOptions();

        }
        else if (browser.equals("chrome"))
            capabilities = WebConnector.OptionsManager.getChromeOptions();
        else if (browser.equals("headless"))
            capabilities = WebConnector.OptionsManager.headlessChromeOptions();
        else
            throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        return capabilities;
    }
    public WebDriver getDriver() {
        return this.driver;
    }

    public void setDriver(WebDriver driver){
        this.driver=driver;
    }



    @Test
    @BeforeClass(description = "Setup")
    @Parameters({"browser"})
    public void setUpDriver(String browser) throws MalformedURLException {
        //String browser = prop.getProperty("browser");
        //String browser=System.getenv("browser");
        String nodeURL = "http://192.168.2.4:17739/wd/hub" ;

        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                System.setProperty("webdriver.chrome.driver","./src/test/lib/chromedriver.exe");
                DesiredCapabilities capability1 = new DesiredCapabilities();

                capability1.setBrowserName("chrome");
                capability1.setPlatform(Platform.WIN10);
                capability1.setVersion("85.0.4183.87");
                System.out.println("Browser " +browser);
                //System.setProperty("webdriver.firefox.driver","./src/test/lib/geckodriver.exe");
                driver = new RemoteWebDriver(new URL(nodeURL),  getCapabilities(browser));
                // session = ((ChromeDriver)driver).getSessionId();
                // driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                String nodeURL2 = "http://192.168.2.4:17739/wd/hub" ;
                System.setProperty("webdriver.gecko.driver","./src/test/lib/geckodriver.exe");
                DesiredCapabilities capability = new DesiredCapabilities();

                capability.setBrowserName("firefox");
                capability.setVersion("81");
                capability.setPlatform(Platform.WIN10);
                System.out.println("Browser " +browser);
                driver = new RemoteWebDriver(new URL(nodeURL2), getCapabilities(browser));
                //driver = new FirefoxDriver();
                driver.manage().window().maximize();
                //  session = ((FirefoxDriver)driver).getSessionId();
                break;
            case "headless":
               // System.setProperty("webdriver.chrome.driver","./src/test/lib/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");

        }
        WebDriverWait wait = new WebDriverWait(getDriver(),10);


    }

    public WebDriverWait driverWait(){
      return new WebDriverWait(getDriver(),10);
    }

    public Actions actions(){  return new Actions(getDriver());  }
   /* @AfterTest
    public void closeDriver(Scenario scenario){
        if(scenario.isFailed()){
            saveScreenshotsForScenario(scenario);
        }
        driver.close();
    }*/

    @AfterClass(description = "Teardown")
    public void teardown () {
        driver.quit();
    }

    private void saveScreenshotsForScenario(final Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }

    public void waitForPageLoad(int timeout){
        ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";");
    }

    public String getSpecificColumnData(String FilePath, String SheetName, String ColumnName) throws InvalidFormatException, IOException {
        FileInputStream fis = new FileInputStream(FilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(SheetName);
        XSSFRow row = sheet.getRow(0);
        int col_num = -1;
        for(int i=0; i < row.getLastCellNum(); i++)
        {
            if(row.getCell(i).getStringCellValue().trim().equals(ColumnName))
                col_num = i;
        }
        row = sheet.getRow(1);
        XSSFCell cell = row.getCell(col_num);
        String value = cell.getStringCellValue();
        fis.close();
        System.out.println("Value of the Excel Cell is - "+ value);
        return value;
    }
}