package Pages.XYZBank;

import Pages.Commands;
import org.openqa.selenium.By;

public class NewAcctDollar extends Commands {

    By openAccountLocator = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]");
    By bankManagerLoginLocator = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerDDLocator = By.xpath("//select[@id='userSelect']");
    By selectJohnDoeLocator = By.xpath("//option[contains(text(),'John Doe')]");
    By currencyDDLocator = By.xpath("//select[@id='currency']");
    By selectDollarLocator = By.xpath("//option[contains(text(),'Dollar')]");
    By processButtonLocator = By.xpath("//button[contains(text(),'Process')]");


    public void clickOpenAccountButton(){clickIt(openAccountLocator);}
    public void clickBankManagerLoginButton() {
        clickIt(bankManagerLoginLocator);
    }
    public void clickCustomerDDBtn(){clickIt(customerDDLocator);}
    public void selectJohnDoe(){clickIt(selectJohnDoeLocator);}
    public void clickProcessButton(){clickIt(processButtonLocator);}
    public void clickCurrencyDD(){clickIt(currencyDDLocator);}
    public void clickDollar(){clickIt(selectDollarLocator);}
}
