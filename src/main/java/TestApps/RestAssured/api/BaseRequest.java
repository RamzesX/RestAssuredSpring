package TestApps.RestAssured.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseRequest {
    private final String baseUri = "https://covid-193.p.rapidapi.com";
    protected final String resultPointer = "/response";
    protected ObjectMapper mapper = new ObjectMapper();
    protected RequestSpecification requestSpecification = given()
            .headers("X-RapidAPI-Key", "9025173fcfmshe89978038b6041fp105e94jsne7a34d6e469f",
                    "X-RapidAPI-Host", "covid-193.p.rapidapi.com")
            .baseUri(baseUri);
}
