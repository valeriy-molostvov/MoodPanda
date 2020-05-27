package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AccountPage extends BasePage {

    By firstName = By.id("ContentPlaceHolderContent_TextBoxFirstname");
    By surnameInitial = By.id("ContentPlaceHolderContent_TextBoxSurname");
    By yearOfBirth = By.id("ContentPlaceHolderContent_TextBoxSurname");
    By gender = By.id("ContentPlaceHolderContent_DropDownListGender");

    public AccountPage openPage() {
        open("https://moodpanda.com/Account/");
        isPageOpened();
        return this;
    }

    public AccountPage isPageOpened() {
        $(byText("Personal Info")).waitUntil(Condition.visible, 30000);
        return this;
    }
//    public
}
