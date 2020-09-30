package applicationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ConstantVariables.Constant;
import org.testng.annotations.Test;

import java.util.*;


public class RestaurantDetail extends BaseTest implements Constant {

	public RestaurantDetail(){
		this.driver = getDriver();
	}
	int basketAmount ;
	//stands for default number of product to add
	//int oneProductAmount = Integer.parseInt(driver.findElement(basketProductNumber).getText());

	int valueOfSideBasket;

	int intValueOfAddToBasketButton;

	public  List<WebElement> productList(WebDriver driver){
		return	driver.findElements(addToBasketButton);
	}
	public List<WebElement> priceList(WebDriver driver){
		return driver.findElements(productPrice);

	}
	@Test(priority = 5, description = "Checking Swiper Menu items - Alles Pizza ...")
	public void checkSwiperMenuLinks() throws Exception {
		driverWait().until(ExpectedConditions.visibilityOfElementLocated(swiperMenuItems));
		List<WebElement> links = getDriver().findElement(swiperMenu).findElements(swiperMenuItems);
		List<String> texts = new ArrayList<String>();
		texts.add(swiperPoppular);
		texts.add(swiperPizza);
		texts.add(swiperDrinks);
		texts.add(swiperDeals);
		texts.add(swiperDiscount);
		System.out.println(texts.get(1));
		System.out.println(texts.get(3));
		System.out.println(links.get(1).getAttribute("href"));
		for(int i = 0; i<links.size();i++) {
			if (links.get(i).getAttribute("href").contains(texts.get(i))) {
				System.out.println(links.get(i).getText());
			}else{
				throw new Exception("Swiper Menu Items Did not Match");
			}
			}
		}
	@Test(priority = 6, description = "Add dish to basket with no side selection")
	public void addRandomProductToBasket() throws InterruptedException {
		int interval = productList(getDriver()).size();
		//valueOfSideBasket = splitPrice(driver.findElement(sideBasketValue).getText());
		int addedProductPrice;
		int index = 1;
		actions.moveToElement(productList(getDriver()).get(index));
		priceList(getDriver()).get(index).click();
		addedProductPrice = splitPrice(priceList(getDriver()).get(index).getText());
		System.out.println(priceList(getDriver()).get(index).getText());

		System.out.println("-----");
		System.out.println(splitPrice(getDriver().findElement(sideBasketValue).getText()));
		System.out.println(addedProductPrice);
		Assert.assertEquals(addedProductPrice,splitPrice(getDriver().findElement(sideBasketValue).getText()));
	}
	@Test(priority = 7, description = "Selecting dish with side product")
	public void clickOnVariantedProduct(){
		productList(getDriver()).get(0).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(additionalDrink));
	}
	@Test(priority = 8, description = "Select side drink")
	public void selectSideDrinkToBasket() throws InterruptedException {
		WebElement ele = getDriver().findElement(additionalDrink);
		Select s = new Select(ele);
		s.selectByIndex(1); // Selecting the second item in dropdown
		}
	@Test(priority = 9, description = "Select side salad")
	public void selectSideSaladToBasket() {
		WebElement salad = getDriver().findElement(By.xpath("//form[starts-with(@id,'isidedishselectionform')]/div[1]/div[2]/div[1]"));
		salad.click();

		Assert.assertTrue(salad.isSelected());
	}
	@Test(priority = 10, description = "Increase amount of product to add to basket")
	public void increaseProductAmount() {
		getDriver().findElement(increaseProductToAdd).click();
		//expect add to cart button price to increase
	}
	@Test(priority = 11, description = "Decrease amount of product to add to basket")
	public void decreaseProductAmount() {
		getDriver().findElement(decreaseProductToAdd).click();
		//expect add to cart button price to decrease
	}

	@Test(priority = 12, description = "Add varianted product to basket")
	public void selectDrinkOption() {
		valueOfSideBasket = splitPrice(getDriver().findElement(sideBasketValue).getText());
		intValueOfAddToBasketButton = Integer.parseInt(getDriver().findElement(addToCartButton).getText().split("€ ")[1].split(",")[0]);
		getDriver().findElement(addToCartButton).click();
		Assert.assertEquals(valueOfSideBasket+3,intValueOfAddToBasketButton);
	}

	@Test(priority = 13, description = "Check add to cart button price tag with basket amount")
	public void checkAddToCartButtonAndBasket(){
		basketAmount = splitPrice(getDriver().findElement(currentBasketValue).getText());
		int currentAmountToAddToBasket = splitPrice(getDriver().findElement((priceOnBasketButton)).getText());

		Assert.assertEquals(basketAmount, currentAmountToAddToBasket);
	}
}






