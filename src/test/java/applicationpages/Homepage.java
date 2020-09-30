package applicationpages;

import ConstantVariables.Constant;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.IOException;


public class Homepage extends BaseTest{

	//Constructor
	public Homepage(){
		this.driver = getDriver();
	}

	//Page Methods
	public void goHomePage() throws IOException, InvalidFormatException {
		String Url = getSpecificColumnData("src/test/testdata/Data.xlsx", "sheet1", "URL");
		getDriver().navigate().to(Url);
		driverWait().until(ExpectedConditions.urlContains(Url));
		System.out.println(getDriver().getTitle());
	}
    public void acceptPrivacyPolicy() {
		driverWait().until(ExpectedConditions.visibilityOfElementLocated(Constant.acceptPrivacyPopUp));

		getDriver().findElement(Constant.acceptPrivacyPopUp).click();
	}
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

	public void selectAddressItem(){
    	try{
    		driverWait().until(ExpectedConditions.visibilityOfElementLocated(Constant.suggestedAddress));
			getDriver().findElement(Constant.suggestedAddress).click();
		} catch (Exception e){
    		e.printStackTrace();
		}
	}
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