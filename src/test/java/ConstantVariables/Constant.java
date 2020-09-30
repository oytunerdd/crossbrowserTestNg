package ConstantVariables;

import org.openqa.selenium.By;

public interface Constant {
	public static final String glue = "stepdefs";
	public static final String tags = "@blog_page";
	public static final String expectedRestaurantUrl = "https://www.thuisbezorgd.nl/eten-bestellen-8888-alpha?search";
	By searchBar = By.id("imysearchstring");
	String searchText = "8888";
	By suggestedAddress = By.cssSelector(".lp__place.notranslate.selected");
	By suggestedAddressAlpha = By.cssSelector(".lp__place.selected");

	By restaurantList = By.id("irestaurantlist");
	By eachRestaurant = By.cssSelector(".js-restaurant");

	By acceptPrivacyPopUp = By.cssSelector(".cc-banner__btn-ok.js-btn-ok");
	int numberOfListItems = 178;

	By testRestaurant = By.linkText("TEST Restaurant Selenium");
	String testRestaurantDetailUrl = "https://www.thuisbezorgd.nl/qa-restaurant-selenium";
	String testRestaurantTitle = "TEST Restaurant Selenium Enschede - Grieks - Thuisbezorgd.nl";


	By swiperMenu = By.cssSelector(".swiper-wrapper");
	By swiperMenuItems = By.cssSelector(".swiper-slide");
	String swiperPoppular = "/alles";
	String swiperPizza = "/italiaanse-pizza-bestellen-8888-alpha#Cuisine=271";
	String swiperDrinks ="https://www.thuisbezorgd.nl/sushi-bestellen-8888-alpha";
	String swiperDeals = "#categorie_Meal_deals";
	String swiperDiscount = "#categorie_Discounts";

	By addToBasketButton = By.cssSelector(".js-meal__add-to-basket-button");
	By additionalDrink = By.xpath("//select[contains(@id,'isidedishpulldown')]");
	String additionalDrinkToSelect = "[label=Water (+€ 3,00)]";
	By currentBasketValue = By.xpath("//span[starts-with(@class,'cart-sum-price')]");
	By priceOnBasketButton = By.xpath("//span[starts-with(@class,'button_add_value')]/h3");
	By tomatoSaladLabel = By.cssSelector("//div[@class='sidedish-checkbox']");
	By increaseProductToAdd = By.cssSelector(".button-add-sidedish");
	By decreaseProductToAdd = By.cssSelector(".button-remove-sidedish");
	By basketProductNumber = By.cssSelector(".basketproductnr");
	By addToCartButton = By.xpath("//button[contains(@class,'add-btn-icon')]");
	//By addToCartButtonValue = By.cssSelector(".button_add_value");
	By sideBasketValue = By.cssSelector(".cart-sum-price");
	By productPrice = By.cssSelector(".meal__price");


	///Address Form
	By addressInput = By.id("iaddress");
	By postcodeInput = By.id("ipostcode");
	By townInput = By.id("itown");
	By nameInput = By.id("isurname");
	By emailInput = By.id("iemail");
	By phoneInput = By.id("iphonenumber");
	By selectClosestAmount = By.id("ipayswith");

}
