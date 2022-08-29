package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostUpdatePage {
    private SelenideElement number = $(By.cssSelector("[class='button is-large is-warning is-light']"));
    private SelenideElement inputField = $(By.cssSelector("[class='textarea is-smdall']"));
    private SelenideElement savePostButton = $(By.cssSelector("[class='button is-rounded is-pulled-right is-warning']"));

    public void chooseRating() {
        number.click();
    }

    public void inputPost() {
        inputField.sendKeys("Sunny mood!");
    }

    public void savePost() {
        savePostButton.click();
    }
}
