package com.IsaacDrachman;

/**
 * Function-type class for polynomials.
 */
public class FPolynomial extends Func {

    /**
     * Array of Doubles representing the coefficients of this polynomial.
     */
    private Double[] coeffs;

    /**
     * Creates a polynomial function with desired coefficients.
     *
     * @param initCoeffs coefficients (for all powers 0 through degree)
     */
    public FPolynomial(Double[] initCoeffs) {
        coeffs = (Double[])initCoeffs.clone();
    }

    // Abstract Func implementation.
    public Double apply(Double x) {
        Double y = 0.0;
        for (int exponent = 0; exponent < coeffs.length; exponent++) {
            y += coeffs[exponent]*Math.pow(x,exponent);
        }
        return y;
    }

    public FPolynomial diff() {
        Double[] newCoeffs = new Double[coeffs.length-1];
        for (int exponent = 1; exponent < coeffs.length; exponent++) {
            newCoeffs[exponent-1] = coeffs[exponent]*exponent;
        }
        return new FPolynomial(newCoeffs);
    }

    public String toString() {
        String formula = "";
        for (int exponent = coeffs.length-1; exponent >= 0; exponent--) {
            if (coeffs[exponent] != 0.0) {
                if (Math.abs(coeffs[exponent]) != 1.0 || exponent == 0)
                    formula += Math.abs(coeffs[exponent]);
                if (exponent == 1)
                    formula += "x";
                if (exponent > 1)
                    formula += "x^" + exponent;
            }
            if (exponent > 0) {
                if (coeffs[exponent-1] < 0)
                    formula += " - ";
                else if (coeffs[exponent-1] > 0)
                    formula += " + ";
            }
        }
        return formula;
    }
}
