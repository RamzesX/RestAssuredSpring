package TestApps.RestAssured.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import TestApps.RestAssured.models.HistoryRow;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class GetStatistics extends BaseRequest {
    private int sharedState;

    public GetStatistics() {
        super();
        QueryableRequestSpecification queryable = SpecificationQuerier.query(requestSpecification);
        requestSpecification.baseUri(queryable.getBaseUri() + "/statistics");
    }

    public Response getResponse() {
        return requestSpecification
                .get();
    }

    public int checkSharedState() {
        int valueToReturn = sharedState;
        sharedState = 3;
        return valueToReturn;
    }

    public Response getResponse(String country) {
        return requestSpecification
                .queryParam("country", country)
                .get();
    }

    public List<HistoryRow> getList(Response response) throws JsonProcessingException {
        JsonNode rootNode = mapper.readTree(
                response.getBody().asString());
        HistoryRow[] statistics = mapper.readValue(
                rootNode.at(resultPointer).toString(), HistoryRow[].class);

        return Arrays.asList(statistics);
    }
}
