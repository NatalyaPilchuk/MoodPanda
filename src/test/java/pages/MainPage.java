package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private SelenideElement yourDashboard = $(By.xpath("//div[contains(@class,'navbar-menu')]//a[@class='navbar-item'][2]"));
    private SelenideElement yourDiary = $(By.cssSelector("[href='/user/7687303']"));
    private ElementsCollection namesOfPeople = (ElementsCollection) $$(By.cssSelector("[class='card-header']"));
    private SelenideElement hugButton = $(By.xpath("//div[contains(@class,'card is-warning')]//a[@class='card-footer-item'][1]"));
    private SelenideElement myName = $(By.xpath("//span[contains(.,'Natali S')]"));
    private SelenideElement threePoints = $(By.cssSelector("[class='svg-inline--fa fa-ellipsis']"));
    private SelenideElement deleteButton = $(By.xpath("//div[contains(@class,'dropdown-content')]//a[@class='dropdown-item'][2]"));

    private SelenideElement greenMessage = $(new ByText("Your post was deleted. It may take a minute or so to update the feeds"));

    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public YourDashboardPage dashboardClick() {
        yourDashboard.click();
        return new YourDashboardPage();
    }

    public void postUpdateClick() {
        postUpdateButton.click();
    }

    public void hugClick() {
        namesOfPeople.first();
        hugButton.click();

    }

    public boolean isMyNameDisplayed() {
        myName.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return myName.isDisplayed();
    }

    public void yourDiaryClick() {
        yourDiary.click();
    }

    public void threePointsClick() {
        threePoints.click();
    }

    public void deletePost() {
        deleteButton.click();
    }

    public boolean isGreenMessageDisplayed() {
        greenMessage.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }
}
