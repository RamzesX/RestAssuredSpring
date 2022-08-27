package TestApps.RestAssured.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoryRow {
    String continent;
    String country;
    int population;
    Cases cases;
    Deaths deaths;
    Tests tests;
    String day;
    String time;
}
