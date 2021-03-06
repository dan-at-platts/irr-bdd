package com.platts.oil.analytics.irr.uat.jbehave.stepdefinitions;

import com.platts.oil.analytics.irr.uat.model.AppPages;
import com.platts.oil.analytics.irr.uat.tasks.DisplayedPage;
import com.platts.oil.analytics.irr.uat.tasks.LoginToApp;
import com.platts.oil.analytics.irr.uat.tasks.OpenAnApp;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.platts.oil.analytics.irr.uat.model.Actors.theActorNamed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by jonathan_cone on 6/21/2016.
 */
public class LoginStepDefinitions {

    @Managed
    WebDriver janesBrowser;

    @Steps DisplayedPage theDisplayedPage;

    @Given("$actor opens the $app application")
    @Pending
    public void i_open_the_app_application(String actor, String app) throws Throwable {
        theActorNamed(actor).can(BrowseTheWeb.with(theBrowserBelongingTo(actor)));
        theActorNamed(actor).attemptsTo(OpenAnApp.theApp("WEA"));
    }

    @When("$actor inputs username $username and password $password")
    public void i_input_username_and_password(String actor, String username, String password) throws Throwable {
        theActorNamed(actor).attemptsTo(LoginToApp.withUsernameAndPassword(username, password));
    }

    @Then("$actor should see the $view view")
    public void i_should_see_the_view(String actor, String view) throws Throwable {
        theActorNamed(actor).should(seeThat(theDisplayedPage, equalTo(AppPages.MultiPlay)));

    }

    private WebDriver theBrowserBelongingTo(String actor) {

        System.setProperty("http.proxyHost", "corp-hts-proxy.mhc");
        System.setProperty("http.proxyPort", "8080");

        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver();

    }
}
