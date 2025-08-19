package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdexExcelente() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(94, 0, 100);

        // assert
        Assertions.assertEquals(0.94, score, 0.001);
    }

    @Test
    public void calcApdexBom() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(85, 0, 100);

        // assert
        Assertions.assertEquals(0.85, score, 0.001);
    }

    @Test
    public void calcApdexRazoavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(70, 0, 100);

        // assert
        Assertions.assertEquals(0.70, score, 0.001);
    }

    @Test
    public void calcApdexRuim() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(50, 0, 100);

        // assert
        Assertions.assertEquals(0.50, score, 0.001);
    }

    @Test
    public void calcApdexInaceitavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(49, 0, 100);

        // assert
        Assertions.assertEquals(0.49, score, 0.001);
    }
}