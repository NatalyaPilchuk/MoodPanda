package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class YourDashboardPage {
    private SelenideElement editProfile = $(By.xpath("//aside[contains(@class,'column is-2 is-fullheight is-hidden-touch side-nav')]//a[@href='/dashboard/editprofile']"));
    private SelenideElement firstNameField = $(By.cssSelector("[placeholder='e.g Jake']"));
    private SelenideElement lastNameField = $(By.cssSelector("[placeholder='e.g. S']"));
    private SelenideElement saveButton = $(By.xpath("//div[contains(@class,'box')]//button[@class='button is-success is-rounded is-pulled-right']"));

    private SelenideElement checkMyName = $(By.cssSelector("[class='title is-4 wrap']"));


    public void editProfile() {
        editProfile.click();
    }

    public void updateFirstName() {
        firstNameField.clear();
        firstNameField.sendKeys("Natali");
    }

    public void updateLastName() {
        lastNameField.clear();
        lastNameField.sendKeys("S");
    }

    public void saveFirstName() {
        saveButton.click();
    }

    public String checkTextOfName() {
        return checkMyName.getText();
    }
}

