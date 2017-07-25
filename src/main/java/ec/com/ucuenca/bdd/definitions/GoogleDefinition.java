package ec.com.ucuenca.bdd.definitions;

import ec.com.ucuenca.bdd.google.steps.GoogleSteps;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.text.MessageFormat;

/**
 * Created by santteegt on 24/07/2017.
 */
public class GoogleDefinition {

    @Steps
    GoogleSteps gs;

    @Given("the user accesses the google landing page")
    public void open_landing_page() {
        gs.open_landing_page();
    }

    @When("they type in $firstname $lastname1 $lastname2")
    public void search_for_keyword(String firstname, String lastname1, String lastname2) {
        gs.search_for_keyword(MessageFormat.format("{0} {1} {2}", firstname, lastname1, lastname2));
    }

    @Then("we should see $keyword within the first occurrence")
    public void find_in_results(String keyword){
        gs.find_in_results(keyword);
    }

    @StepGroup
    @Given("A user goes to google and searches for $keyword")
    public void go_to_google_and_find_me(String keyword) {
        gs.open_landing_page()
                .search_for_keyword(keyword);
    }


}
