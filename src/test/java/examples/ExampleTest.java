package examples;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.qameta.allure.karate.AllureKarate;


class ExampleTest {

    @Test
    void testParallel(){
        Results results = Runner
                .path("classpath:examples")
                .hook(new AllureKarate())
                .outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}
