$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePage/01_NavigateTo_HomePage.feature");
formatter.feature({
  "name": "Home Page Verifications",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check Blog Link displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@home_page"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigates homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.userNavigatesHomepage()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: wait For Condition \"PageLoad\" isn\u0027t supported.\r\n\tat WebConnector.webconnector.waitForCondition(webconnector.java:269)\r\n\tat applicationpages.Homepage.goToHomePage(Homepage.java:29)\r\n\tat stepdefs.HomePageSteps.userNavigatesHomepage(HomePageSteps.java:48)\r\n\tat ✽.User navigates homepage(file:src/test/resources/features/HomePage/01_NavigateTo_HomePage.feature:6)\r\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User enters \"\" into search bar",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userEntersIntoSearchBar(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User selects first suggestion element",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.userSelectsFirstSuggestionElement()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User selects first location",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userSelectsFirstLocation()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User should be redirected to restaurants page",
  "keyword": "Then "
});
formatter.match({
  "location": "RestaurantListSteps.userShouldBeRedirectedToRestaurantsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Restaurants should be listed",
  "keyword": "And "
});
formatter.match({
  "location": "RestaurantListSteps.restaurantsShouldBeListed()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Test Restaurant",
  "keyword": "Then "
});
formatter.match({
  "location": "RestaurantListSteps.userClicksOnTestRestaurant()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User checks swiper menu items",
  "keyword": "And "
});
formatter.match({
  "location": "RestaurantDetailSteps.userChecksSwiperMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User add a non varianted product to basket",
  "keyword": "When "
});
formatter.match({
  "location": "RestaurantDetailSteps.userAddANonVariantedProductToBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User adds varianted product to basket",
  "keyword": "When "
});
formatter.match({
  "location": "RestaurantDetailSteps.userAddsVariantedProductToBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User click on add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "RestaurantDetailSteps.userClickOnAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User adds varianted product to basket",
  "keyword": "When "
});
formatter.match({
  "location": "RestaurantDetailSteps.userAddsVariantedProductToBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User increases product count by 1",
  "keyword": "And "
});
formatter.match({
  "location": "RestaurantDetailSteps.userIncreasesProductCountBy(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User increases product count by 1",
  "keyword": "And "
});
formatter.match({
  "location": "RestaurantDetailSteps.userIncreasesProductCountBy(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User decreases product count by 1",
  "keyword": "And "
});
formatter.match({
  "location": "RestaurantDetailSteps.userDecreasesProductCountBy(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User click on add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "RestaurantDetailSteps.userClickOnAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User fills the address form",
  "keyword": "And "
});
formatter.match({
  "location": "AddressFormSteps.userFillsTheAddressForm()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat WebConnector.webconnector.saveScreenshotsForScenario(webconnector.java:121)\r\n\tat WebConnector.webconnector.closeDriver(webconnector.java:114)\r\n\tat stepdefs.HomePageSteps.after(HomePageSteps.java:37)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:69)\r\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:24)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:134)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:597)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)\r\n\tat org.testng.internal.TestMethodWithDataProviderMethodWorker.call(TestMethodWithDataProviderMethodWorker.java:77)\r\n\tat org.testng.internal.TestMethodWithDataProviderMethodWorker.call(TestMethodWithDataProviderMethodWorker.java:15)\r\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\r\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)\r\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\r\n\tat java.base/java.lang.Thread.run(Thread.java:835)\r\n",
  "status": "failed"
});
});