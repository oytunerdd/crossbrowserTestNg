package tests;

import ConstantVariables.Constant;
import applicationpages.BaseTest;
import applicationpages.Homepage;
import applicationpages.RestaurantDetail;
import applicationpages.RestaurantList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import java.io.IOException;


public class CompleteScenario extends BaseTest implements Constant {

    Homepage homepage = new Homepage();
    RestaurantList restaurantList = new RestaurantList();
    RestaurantDetail restaurantDetail = new RestaurantDetail();

    @Test(priority = 1, description = "Visit Thuisbezorgd Home Page")
    public void visitHomePage() throws IOException, InvalidFormatException {
        this.homepage.goHomePage();

    }
    @Test(priority = 2, description = "Privacy")
    public void acceptPrivacyPolicy(){
        this.homepage.acceptPrivacyPolicy();
    }

    @Test(priority = 3)
    public void searchForARestaurant(){
        this.homepage.enterSearchKey();
        this.homepage.selectAddressItem();
        this.homepage.selectArea();
    }

    //Will fail afterwards needs tuning

    @Test(priority = 4)
    public void shouldBeRedirectedToRestaurantList() throws Exception {
        this.restaurantList.redirectedToRestaurantPage();
        this.restaurantList.checkRestaurantsListed();
    }

    @Test(priority = 5)
    public void selectRestaurant() throws Exception {
        this.restaurantList.clickOnTestRestaurant();
        this.restaurantDetail.checkSwiperMenuLinks();
    }

    @Test(priority = 6)
    public void selectDishToBasketWithNoSideSelection() throws InterruptedException {
        this.restaurantDetail.addRandomProductToBasket();
    }

    @Test(priority = 7)
    public void selectVariantedDish() throws InterruptedException {
        this.restaurantDetail.clickOnVariantedProduct();
        this.restaurantDetail.selectSideDrinkToBasket();
        this.restaurantDetail.selectSideSaladToBasket();
    }

    @Test(priority = 8)
    public void increaseAmountOfProductToAdd(){
        this.restaurantDetail.increaseProductAmount();
    }

    @Test(priority = 9)
    public void decreaseAmountOfProductToAdd(){
        this.restaurantDetail.decreaseProductAmount();
    }

    @Test(priority = 10)
    public void selectDrink(){
        this.restaurantDetail.selectDrinkOption();
    }

    @Test(priority = 11)
    public void checkBasketAndAddToCartButtonValues(){
        this.restaurantDetail.checkAddToCartButtonAndBasket();
    }

    public void fillAddressForm(){
        //....
    }

    public void completeOrder(){
        //...
    }







}
