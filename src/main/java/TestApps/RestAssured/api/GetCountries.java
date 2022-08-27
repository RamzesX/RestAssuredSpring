package TestApps.RestAssured.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class GetCountries extends BaseRequest {

    public GetCountries() {
        super();
        QueryableRequestSpecification queryable = SpecificationQuerier.query(requestSpecification);
        requestSpecification.baseUri(queryable.getBaseUri() + "/countries");
    }

    public Response getResponse() {
        return requestSpecification
                .get();
    }

    public Response getResponse(String query) {
        return requestSpecification
                .queryParam("search", query)
                .get();
    }

    public List<String> getList(Response response) throws JsonProcessingException {
        JsonNode rootNode = mapper.readTree(
                response.getBody().asString());
        String[] countries = mapper.readValue(
                rootNode.at(resultPointer).toString(), String[].class);

        return Arrays.asList(countries);
    }
}
