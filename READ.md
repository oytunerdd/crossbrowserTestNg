# TestNG Crossbrowser Automation



## Installation

Pull the project and build maven dependencies

```bash
mvn install
```

## Selenium Grid Setup

For remote test runs use build.sh under .../lib folder. This will first create Selenium grid with .hubConfig configuration file and later it will create 1 instance per Chrome and Firefox with ./nodeConfig
```
./crossbrowser-automation-grid/src/test/lib/build.sh
```

## Browser Options
There are four options to trigger browsers and test.



```
<!-- Run java command with desired configuration file -->

java org.testng.TestNG testng.xml

```
testng.xml configuration will run Chrome and Firefox accordingly. 

```
<!-- Config files -->
chrome.xml
firefox.xml
headless.xml (chrome)
testng.xml
```

## Reporting
After each test runs AutomationTestNg.html report will be created with ExtentReports

## Data Driven Architecture
It is aimed that static inputs will be provided with Data.xlsx file under /crossbrowser-automation-grid/src/test/testdata/ but the project only reads targeted URL along with some form values but they are not completely implemented. 

For elements - locators and static values use Constant file under /crossbrowser-automation-grid/src/test/java/ConstantVariables

** A better approach is to provide these constants with Data.xlsx file so that you do not need to commit every time an element changes

## License
[MIT](https://choosealicense.com/licenses/mit/)

