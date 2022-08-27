package definitions;

import TestApps.RestAssured.api.GetStatistics;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class StatSteps {
    @Autowired
    private GetStatistics getStatistics;
    @Given("Client check if stat response is not empty")
    public void client_check_if_stat_response_is_not_empty() throws JsonProcessingException {
        Assert.assertNotNull(getStatistics.getList(getStatistics.getResponse()));
    }
}
