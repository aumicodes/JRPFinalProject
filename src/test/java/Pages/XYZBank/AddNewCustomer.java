package Pages.XYZBank;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class AddNewCustomer extends Commands {

    By customerLoginLocator = By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginLocator = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By clickAddCustomerLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By inputFirstNameLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By inputLastNameLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By inputPostCodeLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By addCustomerButtonLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
    By customersButtonLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[3]");


    public void clickBankManagerLoginButton() {
        clickIt(bankManagerLoginLocator);
    }
    public void clickAddCustomerButton() {
        clickIt(clickAddCustomerLocator);
    }
    public void enterFirstName() {
        type(inputFirstNameLocator, "John");
    }
    public void enterLastName() {
        type(inputLastNameLocator, "Doe");
    }
    public void enterPostCode() {
        type(inputPostCodeLocator, "10467");
    }
    public void clickAddCustomer() {
        clickIt(addCustomerButtonLocator);
    }
}