package com.IsaacDrachman;

public class Main {

    public static void main(String[] args) {
        // Create a polynomial, x^2 + 10x + 25
        FPolynomial poly = new FPolynomial(new Double[]{25.0,10.0,1.0});
        // Print the formula of the polynomial
        System.out.println(poly.toString());
        // Print the formula of the derivative
        System.out.println(poly.diff().toString());
        // Perform Newton's method starting at x=4 for 50 iterations.
        System.out.println(NewtonMethod.newton(4,poly,50));
    }
}
