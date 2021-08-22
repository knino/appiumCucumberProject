package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GmailApp;

public class GmailAppSteps {
    GmailApp Gmail = new GmailApp();

    @Given("^Navigate to main page and press send new email$")
    public void navigateToSendMAil(){
        Gmail.clickOnWelcome();
    }

    @When("^I check that the subject and body mail entries are enabled$")
    public void insertCriteria(){
        Gmail.clickActionDone();
        Gmail.clickCloseButton();
        Gmail.clickNewMessageButton();

    }

    @Then("^I check that the subject and body mail entries are enabled, result of check should be true$")
    public void validateCriteria(){
        System.out.println(Gmail.checkForMail());
        Assert.assertTrue("Mail input is disabled", Gmail.checkForMail());
        Assert.assertTrue("Subject input is disabled", Gmail.checkSubjectMail());
        Assert.assertTrue("Body is disabled", Gmail.checkBodyMail());

    }
}
