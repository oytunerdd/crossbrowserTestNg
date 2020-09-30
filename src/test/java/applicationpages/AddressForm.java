package applicationpages;

import ConstantVariables.Constant;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;


public class AddressForm extends BaseTest implements Constant {

	public void fillFormElements() throws InvalidFormatException, IOException{
    /*	String address=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet2", "Address");
		String postCode=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet2", "PostCode");
		String city=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet2", "City");
		String name=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet2", "Name");
		String phoneNum=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet2", "PhoneNum");
		String email=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet2", "e-mail");*/

	/*	getDriver().findElement(addressInput).sendKeys(address);
		getDriver().findElement(postcodeInput).sendKeys(postCode);
		getDriver().findElement(townInput).sendKeys(city);
		getDriver().findElement(nameInput).sendKeys(name);
		getDriver().findElement(phoneInput).sendKeys(phoneNum);
		getDriver().findElement(emailInput).sendKeys(email);
*/

		Select s = new Select(getDriver().findElement(selectClosestAmount));
		s.selectByIndex(1);



       // wc.waitForCondition("PageLoad","",60);
    }

}