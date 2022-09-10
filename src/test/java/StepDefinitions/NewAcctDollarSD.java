package StepDefinitions;

import Helper.Misc;
import Pages.Commands;
import Pages.XYZBank.MyDriver;
import Pages.XYZBank.NewAcctDollar;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAcctDollarSD extends Commands {

    NewAcctDollar NAD = new NewAcctDollar();

    @Given("I launch XYZ Bank website")
    public void launchXYZBank() {
        MyDriver.launchUrlOnNewWindow("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Misc.pause(2);
    }

    @When("I click Bank Manager Login")
    public void managerLogin(){
        NAD.clickBankManagerLoginButton();
        Misc.pause(2);
    }

    @And("I click Open Account")
    public void openAccount(){
        NAD.clickOpenAccountButton();
        Misc.pause(2);
    }

    @And("I click Customer dropdown")
    public void clickCustomerDD(){
        NAD.clickCustomerDDBtn();
        Misc.pause(2);
    }

    @And("I select John Doe")
    public void clickJohnDoe(){
        NAD.selectJohnDoe();
        Misc.pause(2);
    }

    @And("I click Currency dropdown")
    public void clickCurrencyDD(){
        NAD.clickCurrencyDD();
        Misc.pause(2);

    }
    @And("I select Dollar")
    public void clickDollar(){
        NAD.clickDollar();
        Misc.pause(2);
    }

    @And("I click Process button")
    public void clickProcess(){
        NAD.clickProcessButton();
        Misc.pause(2);
    }




}
