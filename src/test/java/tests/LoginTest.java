package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PostUpdatePage;
import pages.YourDashboardPage;

public class LoginTest {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        boolean isMainPageDisplayed = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        Assert.assertTrue(isMainPageDisplayed, "User didn't log in");
    }

    @Test
    public void hugTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.hugClick();
        Assert.assertTrue(mainPage.isMyNameDisplayed(), "there isn't my name");
    }

    @Test
    public void deletePostTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.postUpdateClick();
        PostUpdatePage postUpdatePage = new PostUpdatePage();
        postUpdatePage.chooseRating();
        postUpdatePage.inputPost();
        postUpdatePage.savePost();
        mainPage.yourDiaryClick();
        mainPage.threePointsClick();
        mainPage.deletePost();
        Assert.assertTrue(mainPage.isGreenMessageDisplayed(), "there isn't green message");
    }

    @Test
    public void UpdateFirstNameTest() {
        LoginPage loginPage = new LoginPage();
        loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        MainPage mainPage = new MainPage();
        mainPage.dashboardClick();
        YourDashboardPage yourDashboardPage = new YourDashboardPage();
        yourDashboardPage.editProfile();
        yourDashboardPage.updateFirstName();
        yourDashboardPage.saveFirstName();
        Assert.assertEquals(yourDashboardPage.checkTextOfName(), "Natali S", "there isn't such name ");

    }

    @Test
    public void UpdateLastNameTest() {
        LoginPage loginPage = new LoginPage();
        loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        MainPage mainPage = new MainPage();
        mainPage.dashboardClick();
        YourDashboardPage yourDashboardPage = new YourDashboardPage();
        yourDashboardPage.editProfile();
        yourDashboardPage.updateLastName();
        yourDashboardPage.saveFirstName();
        Assert.assertEquals(yourDashboardPage.checkTextOfName(), "Natali S", "there isn't such name ");
    }
}
