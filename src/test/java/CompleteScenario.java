import ConstantVariables.Constant;
import applicationpages.BaseTest;
import applicationpages.Homepage;
import applicationpages.RestaurantDetail;
import applicationpages.RestaurantList;
import org.testng.annotations.Test;




public class CompleteScenario extends BaseTest implements Constant {


    Homepage homepage = new Homepage();
    RestaurantList restaurantList = new RestaurantList();
    RestaurantDetail restaurantDetail = new RestaurantDetail();

    @Test(priority = 1, description = "Visit Thuisbezorgd Hompe Page")
    public void visitHomePage(){
        this.homepage.goHomePage();
        waitForPageLoad(10);

    }
    @Test(priority = 2, description = "Privacy")
    public void acceptPrivacyPolicy(){
        this.homepage.acceptPrivacyPolicy();
    }
    public void searchForARestaurant(){
        this.homepage.enterSearchKey();
        this.homepage.selectAddressItem();
        this.homepage.selectArea();
    }



    @Test(priority = 2)
    public void shouldBeRedirectedToRestaurantList() throws Exception {
        waitForPageLoad(10);
        this.restaurantList.redirectedToRestaurantPage();
        this.restaurantList.checkRestaurantsListed();
    }

    public void selectRestaurant() throws Exception {
        this.restaurantList.clickOnTestRestaurant();
        this.restaurantDetail.checkSwiperMenuLinks();
    }

    public void selectDishToBasketWithNoSideSelection() throws InterruptedException {
        this.restaurantDetail.addRandomProductToBasket();
    }

    public void selectVariantedDish() throws InterruptedException {
        this.restaurantDetail.clickOnVariantedProduct();
        this.restaurantDetail.selectSideDrinkToBasket();
        this.restaurantDetail.selectSideSaladToBasket();
    }

    public void increaseAmountOfProductToAdd(){
        this.restaurantDetail.increaseProductAmount();
    }
    public void decreaseAmountOfProductToAdd(){
        this.restaurantDetail.decreaseProductAmount();
    }

    public void selectDrink(){
        this.restaurantDetail.selectDrinkOption();
    }

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
