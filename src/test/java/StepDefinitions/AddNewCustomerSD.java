package StepDefinitions;

import Helper.Misc;
import Pages.Commands;
import Pages.XYZBank.AddNewCustomer;
import Pages.XYZBank.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.Command;

public class AddNewCustomerSD extends Commands {

    AddNewCustomer ANC = new AddNewCustomer();

    @Given("I launch XYZ Bank website")
    public void launchXYZBank() {
        MyDriver.launchUrlOnNewWindow("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Misc.pause(2);
    }

    @When("I click Bank Manager Login")
    public void managerLogin(){
        ANC.clickBankManagerLoginButton();
        Misc.pause(2);
        }

    @And("I click Add Customer")
    public void addCustomer(){
        ANC.clickAddCustomerButton();
        Misc.pause(2);
    }

    @And("I enter First Name")
    public void firstName(){
        ANC.enterFirstName();
        Misc.pause(2);
    }

    @And("I enter Last Name")
    public void lastName() {
        ANC.enterLastName();
        Misc.pause(2);
    }

    @And("I enter Post Code")
    public void postCode() {
        ANC.enterPostCode();
        Misc.pause(2);
    }

    @And("I confirm Add Customer")
    public void addCustomerButton() {
        ANC.clickAddCustomer();
        Misc.pause(2);
    }
}
