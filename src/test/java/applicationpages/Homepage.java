package applicationpages;

import ConstantVariables.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class Homepage extends BaseTest{
	//WebDriver driver;

	//Constructor
	public Homepage(){
		this.driver = getDriver();
	}

	//Page Methods
	public void goHomePage(){
		getDriver().navigate().to("https://www.thuisbezorgd.nl");
		driverWait().until(ExpectedConditions.urlContains("https://www.thuisbezorgd.nl"));
		System.out.println(getDriver().getTitle());
	}
	@Test(priority = 2, description ="Accepting Cookies")
    public void acceptPrivacyPolicy() {
		driverWait().until(ExpectedConditions.visibilityOfElementLocated(Constant.acceptPrivacyPopUp));

		getDriver().findElement(Constant.acceptPrivacyPopUp).click();
	}
	@Test(priority = 3, description="Entering search key")
    public void enterSearchKey()
	{
		try {
			WebElement search = getDriver().findElement(Constant.searchBar);
			search.click();
			search.sendKeys(Constant.searchText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 4, description = "Search for locations to deliver")
	public void selectAddressItem(){
    	try{
    		driverWait().until(ExpectedConditions.visibilityOfElementLocated(Constant.suggestedAddress));
			getDriver().findElement(Constant.suggestedAddress).click();
		} catch (Exception e){
    		e.printStackTrace();
		}
	}
	@Test(priority = 4, description = "Select areas")
	public void selectArea(){
		try {
			driverWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("reference")));
			getDriver().findElements(By.id("reference")).get(0).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}