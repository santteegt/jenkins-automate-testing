package ec.com.ucuenca.bdd.google.steps;

import ec.com.ucuenca.bdd.google.pages.GoogleDashboard;
import ec.com.ucuenca.bdd.google.pages.GoogleLanding;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by santteegt on 24/07/2017.
 */
public class GoogleSteps extends ScenarioSteps {

    GoogleLanding landingPage;
    GoogleDashboard dashboardPage;

    public GoogleSteps(Pages pages) {
        super(pages);
    }

    @Step
    public GoogleSteps open_landing_page(){
        landingPage.open();
        return this;
    }

    @Step
    public GoogleSteps search_for_keyword(String keyword){
        landingPage.search(keyword.toLowerCase());
        return this;
    }

    @Step
    public GoogleSteps find_in_results(String keyword){
        landingPage.findUrl(keyword.toLowerCase());
        return this;
    }
}

