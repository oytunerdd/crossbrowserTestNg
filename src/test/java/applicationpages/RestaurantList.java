package applicationpages;

import ConstantVariables.Constant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RestaurantList extends BaseTest implements Constant{
	WebDriverWait wait = new WebDriverWait(getDriver(),    10);
	Actions actions = new Actions(getDriver());

    public void redirectedToRestaurantPage(){
		System.out.println(getDriver().getCurrentUrl());
		try{
			wait.until(ExpectedConditions.urlMatches(expectedRestaurantUrl));
			Assert.assertEquals(getDriver().getCurrentUrl(),expectedRestaurantUrl);
		}catch (Exception e){
			e.printStackTrace();
		}

    }

   public void checkRestaurantsListed() throws Exception {
    	int size = getDriver().findElements(eachRestaurant).size();
	  	String listSize = Integer.toString(size);
		if (size == numberOfListItems ){
			System.out.println("Restaurants listed: " + listSize);
		}else{
			throw new Exception("Not all Restaurants are listed !");
		}
    }

    public void clickOnTestRestaurant(){
    	try {
			WebElement rest = getDriver().findElement(testRestaurant);
			actions.moveToElement(rest);
			rest.click();
			wait.until(ExpectedConditions.titleContains(testRestaurantTitle));
		}catch (Exception e){
    		e.printStackTrace();
		}

	}



}