package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.MercadoLibre;

public class MercadoLibreSteps {
    MercadoLibre ML = new MercadoLibre();

    @Given("^Navigate in mercadolibre$")
    public void navigateToMercadoLibre(){
        ML.navigateToMercadoLibre();
   }

    @When("^Enter Search criteria$")
    public void insertCriteria(){
        ML.sendCriteria();
    }

    @And("^Click on search button$")
    public void clickAndSearch(){
        ML.clickSearch();
    }

    @Then("^Result match the criteria$")
    public void validateCriteria(){
        Assert.assertEquals("Consola Nintendo Switch | MercadoLibre.cl",ML.getTitle());
    }

    @Given("^Navigate for products list page in mercado libre$")
    public void MercadoLibreProductPages(){
    ML.MercadoLibreProductPages();
    }

    @When("^I click in Full button Bar$")
    public void clickOrderBy(){
        ML.clickFullBar();
    }

    @Then("^I take the class of the bar button to check that it is activated$")
    public void getFirstPrice(){
        Assert.assertEquals("ui-search-animated-switch__switch-bar ui-search-animated-switch__switch-bar--on", ML.getClassAtribute());

    }



}
