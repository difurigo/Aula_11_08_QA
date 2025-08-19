package org.example;

// RM: 558755

public class Apdex {

    public double calculcarApdex(double s, double to, double ta) {
        return (s + (to / 2)) / ta;
    }

}
