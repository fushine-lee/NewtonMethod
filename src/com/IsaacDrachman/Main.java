package com.IsaacDrachman;

public class Main {

    public static void main(String[] args) {
        // Create a polynomial: x^2 + 10x + 25
        FPolynomial poly1 = new FPolynomial(new Double[]{25.0,10.0,1.0});

        // Print the formula of the polynomial.
        System.out.println(poly1.toString());
        // Print the formula of the derivative.
        System.out.println(poly1.diff().toString());

        // Perform Newton's method starting at x=0 for 50 iterations.
        System.out.println(NewtonMethod.newton(0.0,poly1,50));

        System.out.println(""); // Make some space.

        // Create a polynomial: 1 - x
        FPolynomial poly2 = new FPolynomial(new Double[]{1.0,-1.0});
        // Create another polynomial: x^2 - 3
        FPolynomial poly3 = new FPolynomial(new Double[]{-3.0,0.0,1.0});

        // Create a function which is the product.
        FProduct prod = new FProduct(poly2,poly3);

        // Print the formula of this product.
        System.out.println(prod.toString());
        // Print the formula of the derivative.
        System.out.println(prod.diff().toString());

        // Perform Newton's method starting at x=-5 for 50 iterations.
        System.out.println(NewtonMethod.newton(-5.0,prod,50));
    }
}
