package TestApps.RestAssured.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Tests {
    @JsonProperty("1M_pop")
    int OneMillionPop;
    int total;
}
