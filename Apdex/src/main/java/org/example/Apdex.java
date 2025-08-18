package org.example;

public class Apdex {

    public double calculcarApdex(int s, int to, int ta) {
        double resultado = (s + (to / 2)) / ta;
        return resultado;
    }

}
