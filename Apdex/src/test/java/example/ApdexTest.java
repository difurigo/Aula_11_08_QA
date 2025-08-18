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
        double score = apdex.calculcarApdex(90, 0, 100);

        // assert
        Assertions.assertEquals(0.90, score);
    }
}