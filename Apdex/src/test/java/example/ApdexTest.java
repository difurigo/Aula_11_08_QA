package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// RM: 558755

public class ApdexTest {

    @Test
    public void calcApdexExcelente() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(525229.7, 0, 558755);

        // assert
        Assertions.assertEquals(0.94, score, 0.001);
    }

    @Test
    public void calcApdexBom() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(474941.75, 0, 558755);

        // assert
        Assertions.assertEquals(0.85, score, 0.001);
    }

    @Test
    public void calcApdexRazoavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(391128.5, 0, 558755);

        // assert
        Assertions.assertEquals(0.70, score, 0.001);
    }

    @Test
    public void calcApdexRuim() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(279377.5, 0, 558755);

        // assert
        Assertions.assertEquals(0.50, score, 0.001);
    }

    @Test
    public void calcApdexInaceitavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        double score = apdex.calculcarApdex(273789.95, 0, 558755);

        // assert
        Assertions.assertEquals(0.49, score, 0.001);
    }
}