import TestApps.RestAssured.api.GetCountries;
import TestApps.RestAssured.api.GetHistory;
import TestApps.RestAssured.api.GetStatistics;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RestTests extends BaseTest {
    @Autowired
    private GetHistory getHistory;
    @Autowired
    private GetCountries getCountries;
    @Autowired
    private GetStatistics getStatistics;

    int firstResult;


    @Test
    public void firstCallOnSharedState() throws JsonProcessingException {
        firstResult = getStatistics.checkSharedState();
    }

    @Test
    public void secondCallOnSharedState() throws JsonProcessingException {
        Assert.assertNotEquals(firstResult, getStatistics.checkSharedState());
    }

    @Test public void checkListOfStatistics() throws JsonProcessingException {
        Assert.assertNotNull(getStatistics.getList(getStatistics.getResponse()));
    }
}
