package TestApps.RestAssured.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Deaths {
    @JsonProperty("new")
    int newDeaths;
    @JsonProperty("1M_pop")
    double OneMillionPop;
    int total;
}
