package TestApps.RestAssured.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cases {
    @JsonProperty("new")
    int newCases;
    int active;
    int critical;
    int recovered;
    @JsonProperty("1M_pop")
    int OneMillionPop;
    int total;
}
