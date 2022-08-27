package definitions;

import TestApps.RestAssured.SpringBootContextRunner;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootContextRunner.class)
public class GlueCode extends AbstractTestNGSpringContextTests {

}
