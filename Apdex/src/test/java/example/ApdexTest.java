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
        double score = apdex.calculcarApdex(90, 0, 100);

        // assert
        Assertions.assertEquals(0.94, score, 0);
    }

    @Test
    public void calcApdexBom() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(90, 0, 100);

        // assert
        Assertions.assertEquals(0.85, score, 0);
    }

    @Test
    public void calcApdexRazoavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(90, 0, 100);

        // assert
        Assertions.assertEquals(0.70, score, 0);
    }

    @Test
    public void calcApdexRuim() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(90, 0, 100);

        // assert
        Assertions.assertEquals(0.50, score, 0);
    }

    @Test
    public void calcApdexInaceitavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(90, 0, 100);

        // assert
        Assertions.assertEquals(0.0, score, 0);
    }
}