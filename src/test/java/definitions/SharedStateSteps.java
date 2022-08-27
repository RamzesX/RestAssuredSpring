package definitions;

import TestApps.RestAssured.api.GetCountries;
import TestApps.RestAssured.api.GetHistory;
import TestApps.RestAssured.api.GetStatistics;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Given;
import org.testng.Assert;

public class SharedStateSteps {
    @Autowired
    private GetHistory getHistory;
    @Autowired
    private GetCountries getCountries;
    @Autowired
    private GetStatistics getStatistics;

    int firstResult;

    @Given("CheckInitialValueOfSharedState")
    public void checkInitialState() {
        firstResult = getStatistics.checkSharedState();
    }

    @Given("CheckSharedStateValueAfterChange")
    public void checkStateAfterChange() {
        Assert.assertNotEquals(firstResult, getStatistics.checkSharedState());
    }
}