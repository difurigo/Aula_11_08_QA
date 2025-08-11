package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdex() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        float score = apdex.calculcarApdex(770, 60, 100);

        // assert
        Assertions.assertEquals(0.80, score, 0.001);
    }
}