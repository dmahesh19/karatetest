package examples.users123;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import io.qameta.allure.karate.AllureKarate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestsTest {

    @Test
    void testParallel(){
        Results results = Runner
                .path("classpath:examples/users123")
                .hook(new AllureKarate())
                .outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}
