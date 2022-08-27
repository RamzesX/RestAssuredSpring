import TestApps.RestAssured.SpringBootContextRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes = SpringBootContextRunner.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

}
