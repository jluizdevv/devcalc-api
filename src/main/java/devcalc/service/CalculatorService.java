package devcalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero.");
        return (double) a / b;
    }

    public double sqrt(int x) {
        if (x < 0) throw new IllegalArgumentException("Número negativo não possui raiz real.");
        return Math.sqrt(x);
    }
}
